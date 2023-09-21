import java.util.*;
import java.util.ArrayList;
class ArrayLists
{
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
	public static void main(String args[])
	{
		Integer[] nums = {1,3,5,3};

		// ArrayList<Integer> list = new ArrayList<>();

		// for(int i=0; i<nums.length; i++)
		// 	list.add(nums[i]);

		// System.out.println(isMonotonic(list));

		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i=0; i<nums.length; i++) list2.add(nums[i]);

		ArrayList<Integer> temp = lonelyNumbers(list2);
		System.out.println(temp);
	}
}