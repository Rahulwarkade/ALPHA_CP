import java.util.*;

public class Bits_ManipulationQs
{
	static int xor(int x)
	{
		return x^x;
	}
	static void swap(int a,int b)
	{
		System.out.println("a = "+a+" b = "+b);
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("a = "+a+" b = "+b);
	}
	static int addOneUsingBits(int n)
	{
		return -(~n);
	}
	static char upperCaseToLowerCase(char ch)
	{
		char res = (char)(ch | ' ');
		return res;
	}	
	static char LowerCaseToupperCase(char ch)
	{
		char res = (char)(ch & '_');
		return res;
	}
	public static void main(String args[])
	{
		Scanner jin  = new Scanner(System.in);
		int x = jin.nextInt();

		System.out.println(addOneUsingBits(6));
	}
}