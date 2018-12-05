

// Solution for Fibonacci Modified

// Under Dynamic Programming

static BigInteger fibonacciModified(int t1, int t2, int n) {

            BigInteger ti = BigInteger.valueOf(t1);

            BigInteger ti_1 = BigInteger.valueOf(t2);

            BigInteger result = new BigInteger("0");

            int current = 3;

            while(current <= n)
            {
                result = ti.add(ti_1.pow(2));

                ti = ti_1; 
                
                ti_1 = result;

                current++;

            }

           return result;
    }