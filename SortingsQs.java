import java.util.Arrays;
import java.util.Collections;

public class SortingsQs
{
	static void printArr(int arr[])
	{
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void bubbleSort(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int swaps = 0;
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swaps++;
				}
			}
			if(swaps==0) break;
		}
	}
	static void selectionSort(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int maxIdx = i;
			int swaps = 0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[maxIdx]<arr[j])
				{
					maxIdx = j;
					swaps++;
				}
			}
			if(swaps==0) break;
			int temp = arr[i];
			arr[i] = arr[maxIdx];
			arr[maxIdx] =temp;
		}
	}

	static void insertionSort(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			int curr = arr[i];
			int prev = i-1;

			while(prev>=0 && arr[prev]<curr)
			{
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = curr;
		}
	}

	static void countSort(int arr[])
	{
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(largest<arr[i])
				largest = arr[i];
		}

		int countArr[] = new int[largest+1];
		for(int i=0; i<arr.length; i++)
			countArr[arr[i]]++;

		int j= 0;
		for(int i=countArr.length-1; i>=0; i--)
		{
			while(countArr[i]>0)
			{
				arr[j] = i;
				j++;
				countArr[i]--;
			}
		}
	}
	public static void main(String args[])
	{
		int arr[] = {3,6,2,1,8,7,4,5,3,1};
		bubbleSort(arr);
		selectionSort(arr);
		insertionSort(arr);
		countSort(arr);
	}
}
