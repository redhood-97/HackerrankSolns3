

// The Power Sum problem using Recursion

public static int powerSum(int X, int N, int num)
{
	if(Math.pow(num, N) > X)
	{
		return 0;
	}
	else if(Math.pow(num, N) == 0)
	{
		return 0;
	}
	else
	{
		return powerSum(X, N, num + 1) + powerSum(X - (int)Math.pow(num, N), N, num + 1);
	}
}


/* It can be visualised as a descending tree where either we take or reject the 
   contribution of the previous 'num' raised to the power 'N' value. A two-way
   branch is created for each node and the parameters for the recursive function
   call are changed accordingly */