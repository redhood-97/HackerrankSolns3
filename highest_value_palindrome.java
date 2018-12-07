
// Highest Palindrome problem under the Strings category

static char[] to_array(String s)
{
	char[] result = new char[s.length()];

	for(int i = 0; i < s.length(); i++)
	{
		result[i] = s.charAt(i);
	}

	return result;
}

static String to_string(char[] a)
{
	String result = new String();

	for(int i = 0; i < a.length; i++)
	{
		result = result + Character.toString(a[i]);
	}

	return result;
}

static char max_val(String s)
{
	char result = s.charAt(0);

	for(int i = 0; i < s.length(); i++)
	{
		if(Character.getNumericValue(s.charAt(i)) > Character.getNumericValue(result))
		{
			result = s.charAt(i);
		}
	}

	return result;
}

static String highestValuePalindrome(String s, int n, int k)
{
	int str_len = s.length();

	char[] char_arr = new char[s.length()];

	char_arr = to_array(s);

	int step_counter = 0;

	for(int i = str_len/2 - 1, j = str_len/2; i >= 0 && j < str_len; i--, j++)
	{
		if(step_counter < k)
		{
			if(char_arr[i] != char_arr[j])   // not a palindrome for the sub-section
			{
				if(char_arr[i] != max_val(s))
				{
					char_arr[i] = max_val(s);

					step_counter++;
				}

				if(step_counter < k)
				{
					if(char_arr[j] != max_val(s))
					{
						char_arr[j] = max_val(s);

						step_counter++;
					}
				}
				else
				{
					return String.valueOf("-1");
				}
			}
		}
		else
		{
			return String.valueOf("-1");
		}
	}

	return to_string(char_arr);
}