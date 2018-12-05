

// Coin change using dynamic solution code

static long getWays(long[] coins, long amount) {
    
      long[] combinations = new long[(int)amount + 1];

      Arrays.fill(combinations, 0);

      combinations[0] = 1;

      for(int i = 0; i < coins.length; i++)
      {
          for(int j = (int) coins[i]; j <= (int) amount; j++)
          {
              combinations[j] = combinations[j] + combinations[j - (int)coins[i]];
          }
      }

      return combinations[(int)amount];

    }

    