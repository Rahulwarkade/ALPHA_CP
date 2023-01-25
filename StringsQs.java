import java.util.*;
import java.util.Arrays;

public class StringsQs 
{
	static void countLowerCase(String str)
	{
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				char ch = str.charAt(i);
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
					count++;
			}
		}
		System.out.println(count);
	}

	static void checkAnagram(String str1, String str2)
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if(str1.length() == str2.length())
		{
			char str1CharArray[] = str1.toCharArray();
			char str2CharArray[] = str2.toCharArray();

			Arrays.sort(str1CharArray);
			Arrays.sort(str2CharArray);

			boolean result = Arrays.equals(str1CharArray,str2CharArray);

			if(result)
			{
				System.out.println(str1+" and "+str2+" are anagram of eachother");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are not an anagram of eachother");

			}
		}
		else
		{
			System.out.println(str1+" and "+str2+" are not anagram of eachother");

		}
	}
	public static void main(String args[])
	{
		Scanner jin  = new Scanner(System.in);

		checkAnagram("earth","heart");
	}
}