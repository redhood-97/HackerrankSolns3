

/* 
   
   Check the semi-prime numbers

   Codility test for Grab

   Two arrays P and Q have elements respectively which describe the range.

   for example, if P[0] = 10 and Q[0] = 26, we need to find the number of semi-primes
   in the range(10, 26).....and return the results as an integer array for all the
   P and Q indices.

*/

class Solution
{
	static int checksemiprime(int n)
	{
		int ct = 0;

		for(int i = 2; ct < 2 && i * i <= n; i++)
		{
			while(num % i == 0)
			{
				num /= i;

				++ct;
			}
		}

		if(num > 1)
		{
			++ct;
		}

		return ct == 2 ? 1 : 0;
	}

	static boolean semiprime(int n)
	{
		if(checksemiprime(n) != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static int[] Solution(int N, int[] P, int[] Q)
	{
		int counter; 

		int[] result = new int[P.length];

		for(int i = 0; i < P.length; i++)
		{
			counter = 0;

			for(int j = P[i]; j <= Q[i]; j++)
			{
				if(semiprime(j) == true)
				{
					counter++;
				}
			}

			result[i] = counter;
		}

		return result;
	}
}