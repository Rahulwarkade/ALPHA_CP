import java.util.*;

class RecursionQs{
	
	public static void keyOccurrencesIndices(int[] arr,int i,int key)
	{
		if(i==arr.length) return;
		if(arr[i]==key) System.out.print(i+", ");
		keyOccurrencesIndices(arr,i+1,key);
	}

	// public static void numberToEnglish(int num,String[] str)
	// {
	// 	int len = ((int)Math.log(num))+1;
	// 	if(len==1) return;
	// 	int count = 1;
	// 	num/=10;
	// 	numberToEnglish(num,str);
	// 	int idx = num%10;
	// 	System.out.print(str[idx]+" ");
	// }
	public static void main(String args[])
	{
		int[] arr = {3,2,4,5,6,2,7,2,2};
		int key = 2;
		String[] str = {"zero","one","two","three","four","six","seven","eight","nine"};
		int num = 2024;
		// keyOccurrencesIndices(arr,0,key);
		numberToEnglish(num,str);
	}
}