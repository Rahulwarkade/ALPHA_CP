import java.util.*;

class Time_and_Space_Complexity
{


// TIME COMPLEXITY = O(n*log(n)) space complexity = O(1)
	public static void a()
	{
		int i,j,k = 0,n = 16;

		for(i = n/2; i<=n; i++)
		{
			for(int i=2; i<=n; j*=2)
			{
				k = k+n/2;
			}
		}
	}


// TC = O(log(kn)) (log(n) of base K) sp = O(1)
	public static voiid b()
	{
		int k = 69; // any constant 
		for(int i=0; i<=n; i++)
			i*=k;
	}


// FALSE
	public static void c()
	{
		// Algorithm A and B have a worst-case running time ofO(n) and O(logn),respectively.Therefore,algorithm B always runs faster than algorithm A.
	}



// TC = O(sqrt(n))
	public  static void d(int x)
	{
		if(x==0 || x ==1) return x;

		int i =1,result = 1;

		while(result<=x)
		{
			i++;
			result = i+i;
		}
		return i-1;
	}
	public static void main(String args[])
	{

	}
}

