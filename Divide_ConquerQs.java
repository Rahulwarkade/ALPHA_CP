import java.util.*;

class Divide_ConquerQs
{

	public static void merge(String[] arr,int si, int mid,int ei)
	{
		int n = ei-si+1;
		String[] temp = new String[n];

		int i =  si,j=mid+1,k = 0;

		while(i<=mid && j<=ei)
		{
			if(arr[i].compareTo(arr[j])>0)
				temp[k++] = arr[j++];
			else
				temp[k++] = arr[i++];
		}

		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=ei) 
			temp[k++] = arr[j++];

		for(int t = 0,m = si; t<n; t++,m++)
		{
			arr[m] = temp[t];
		}
	}
	public static void mergeSort(String[] arr,int si,int ei)
	{
		if(si>=ei) return;

		int mid = si+((ei-si)/2);
		mergeSort(arr,si,mid);
		mergeSort(arr,mid+1,ei);
		merge(arr,si,mid,ei);
	}
	public static void main(String args[])
	{
		String arr[] = {"sun","earth","mars","mercury"};

		mergeSort(arr,0,arr.length-1);

		for(int i=0;i<arr.length; i++) System.out.print(arr[i]+" ");
	}
}