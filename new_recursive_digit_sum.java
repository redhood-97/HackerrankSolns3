
static BigInteger superDigit(String n, int k)
{

	BigInteger temp_sum = BigInteger.valueOf(0);

	for(int i = 0; i < n.length(); i++)
	{
		int conversion = Character.getNumericValue(n.charAt(i));

		temp_sum = temp_sum.add(BigInteger.valueOf(conversion));
	}

	temp_sum = temp_sum.multiply(BigInteger.valueOf(k));

	if(String.valueOf(temp_sum).length() > 1)
		return superDigit(String.valueOf(temp_sum), 1);
	else
		return temp_sum;
}

//  This code works for all the test cases for the problem Recursive Digit Sum