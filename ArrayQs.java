import java.util.*;

public class ArrayQs
{
	public static boolean containsDuplicates(int nums[])
	{
		//BRUTE FORCE APPROACH
		// for(int i=0; i<nums.length; i++)
		// {
		// 	for(int j=i+1; j<nums.length; j++)
		// 	{
		// 		if(nums[i]==nums[j])
		// 			return true;
		// 	}
		// }
		// return false;

		//OPTIMIZED APPROACH

		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<nums.length; i++)
		{
			if(set.contains(nums[i]))
			{
				return true;
			}
			else
			{
				set.add(nums[i]);
			}
		}
		return false;
	}

	static int rotatedSearch(int arr[],int target, int si,int ei)
	{	
		while(si<=ei)
		{
			 int mid = si+(ei-si)/2;
			if(arr[mid]==target)
			{
				return mid;
			}

		//L1
			if(arr[si]<=arr[mid])
			{
				//a-left
				if((arr[si]<=target) && (target<arr[mid]))
				{
					ei = mid-1;
				}
				//b-right
				else 
				{
					si = mid+1;
				}
			}
		//L2
			else 
			{
				//a
				if((arr[mid]<target) && (target <= arr[ei]))
				{
					si = mid+1;
				}
				else 
				{
					ei = mid-1;
				}
			}

		}
		return -1;
	}

	public static int buyNsellStocks(int prices[])
	{
		int minBuyingPrice = Integer.MAX_VALUE;
		int maxprofit = 0;		
		for(int i=1; i<prices.length; i++)
		{
			if(minBuyingPrice<prices[i])
			{
				int profit = prices[i] -minBuyingPrice;
				maxprofit = Math.max(maxprofit,profit);

			}
			else 
			{
				minBuyingPrice = prices[i];
			}
		} 
		return maxprofit;
	}
	static int traipingRainWAter(int height[])
	{
		int leftMax[] = new int[height.length];
		int rightMax[] = new int[height.length];
		int waterLevel[] = new int[height.length];
		int trappedWater =0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<height.length; i++)
		{
			if(height[i]>max)
			{
				max = height[i];
			}
			leftMax[i] = max;
		}	
		max = Integer.MIN_VALUE;	
		for(int i=height.length-1; 0<=i; i--)
		{
			if(height[i]>max)
			{
				max = height[i];
			}
			rightMax[i] = max;
		}

		for(int i=0; i<height.length; i++)
		{
			waterLevel[i] = Math.min(leftMax[i],rightMax[i]);
			trappedWater += (waterLevel[i]-height[i]);
		}

		return trappedWater;
	}
	public static void main(String args[])
	{
		int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int water = traipingRainWAter(height);
		System.out.println(water);
	}
}