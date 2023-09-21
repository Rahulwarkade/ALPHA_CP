import java.util.*;
import java.util.ArrayList;
class ArrayLists
{

// problem 1. check arraylist is monotonic 
	public static Boolean isMonotonic(ArrayList<Integer> list)
	{
		int n = list.size();
		Boolean flag1 = true,flag2 = true;

		for(int i=0; i<n-1; i++)
		{
			if(list.get(i)>list.get(i+1)) flag1 = false;
			if(list.get(n-i-1)>list.get(n-i-2)) flag2 = false;
		}

		return flag1 || flag2;
	}


// problem 2.  find lonely Numbers from the arraylist
	public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		int n = list.size();

		for(int i=0; i<n; i++)
		{
			boolean flag = false;
			for(int j=0; j<n; j++)
			{
				if( i!=j && list.get(i)==list.get(j))
				{
					flag = true;
					break;
				}
			}

			if(!flag && !(list.contains(list.get(i)-1) || list.contains(list.get(i)+1)))
			{
				ans.add(list.get(i));
			}
		}

		return ans;
	}

	public static Integer freqFollowingKey(ArrayList<Integer> list,int key)
	{
		int n = list.size();
		ArrayList<Integer> followup = new ArrayList<>();

		for(int i=0; i<n; i++)
		{
			int freq = 0;
			for(int j=1; j<n; j++)
			{
				if(list.get(i)==list.get(j))
				{
					if(key==list.get(j-1))
					{
						freq++;
					}
				}
			}
		followup.add(freq);
		}
		int idx = -1;
		int maxValue = 0;
		for(int i=0; i<n; i++)
		{
			if(maxValue<followup.get(i))
			{
				maxValue = followup.get(i);
				idx = i;
			}
		}
		int ans = (idx!=-1)? list.get(idx) : -1;
		System.out.println(followup);
		return ans;
	}
	public static void main(String args[])
	{
		Integer[] nums = {2,2,2,2,3};

		ArrayList<Integer> list = new ArrayList<>();



		// System.out.println(isMonotonic(list));

		for(int i=0; i<nums.length; i++) list.add(nums[i]);

		// ArrayList<Integer> temp = lonelyNumbers(list2);
		// System.out.println(temp);

		System.out.println(freqFollowingKey(list,2));
	}
}