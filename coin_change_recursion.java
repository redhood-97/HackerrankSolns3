

// Coin change problem ( with repitions allowed ) using recursive solution

static long getWays(long[] c, int c_len, long sum)
{
	if(sum == 0)
	{
		return 1;
	}
	else if(sum < 0)
	{
		return 0;
	}

	if(c_len <= 0 && sum >= 1)
	{
		return 0;
	}

	return getWays(c, c_len - 1, sum) + getWays(c, c_len, sum - c[c_len - 1]);
}



 n = 7 , S = {1,3,4} m = 3, i.e, the length of the coin array

 table = { , , , , , }     

  for(int i = 0; i < m; i++)
  {
  		for(int j = S[i]; j <=n; j++)
  		{
  			 	table[j] = table[j] + table[j - S[i]];
  		}
  }

  Logic summary :

  if AMOUNT >= COIN_VALUE THEN 
  		COMBINATIONS[AMOUNT] = COMBINATIONS[AMOUNT] + COMBINATIONS[AMOUNT - COIN_VALUE]

 i = 0;
 	j = 1   table[1] = table[1] + table[0] = 1
 	j = 2   table[2] = table[2] + table[1] = 1
 	j = 3	table[3] = table[3] + table[2] = 1
 	j = 4   table[4] = table[4] + table[3] = 1
 	j = 5	table[5] = table[5] + table[4] = 1
 	j = 6   table[6] = table[6] + table[5] = 1
 	j = 7   table[7] = table[7] + table[6] = 1

 i = 1; S[i] = 3
	j = 3   table[3] = table[3] + table[0] = 1 + 1 = 2
	j = 4   table[4] = table[4] + table[1] = 1 + 1 = 2
	j = 3   table[5] = table[5] + table[2] = 1 + 1 = 2
	j = 3   table[6] = table[6] + table[3] = 1 + 1 = 2

i = 2, S[i] = 4
	j = 2   table[2] = table[2] + table[] = 1 + 1 = 2
	j = 3   table[3] = table[3] + table[0] = 1 + 1 = 
	j = 3   table[3] = table[3] + table[0] = 1 + 1 = 2