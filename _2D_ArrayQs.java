import java.util.*;

public class _2D_ArrayQs
{	
	static int numberCount(int arr[][],int num)
	{
		//BRUTE FOCE APPROACH

		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				if(arr[i][j]==num)
					count++;
			}
		}
		return count;
	}
	static void secondRowSum(int arr[][])
	{
		int secondRow = 1;
		int sum =0;
		for(int i=0; i<arr[0].length; i++)
			sum += arr[secondRow][i];

		System.out.println(sum);
	}

	static void transposedMatrix(int arr[][])
	{	int col = arr.length;
		int row = arr[0].length;
		int transpose[][] = new int[row][col];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				transpose[j][i] = arr[i][j]; 
			}
		}

		printArr(transpose);
	}

	static void printArr(int arr[][])
	{
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int arr[][] = {
			{1,4,9},
			{11,4,3}
		};
	}
}
