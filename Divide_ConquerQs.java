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

	public static int majorityCount(int[] nums)
	{
		int n = nums.length;
		int majoritycount = n/2;

		for(int i=0; i<n; i++)
		{	
			int count =0;
			for(int j=i; j<n; j++)
			{
				if(nums[i]==nums[j])
					count++;
			}
			if(count>majoritycount) return nums[i];
		}
		return -1;
	}
	public static void main(String args[])
	{
		String arr[] = {"sun","earth","mars","mercury"};
		int[] nums = {2,2,1,1,1,2,2,2};

		// mergeSort(arr,0,arr.length-1);
		// for(int i=0;i<arr.length; i++) System.out.print(arr[i]+" ");

		System.out.println(majorityCount(nums));
	}
}