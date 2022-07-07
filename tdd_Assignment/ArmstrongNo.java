package tdd_Assignment;

public class ArmstrongNo {
	
	public static boolean isArmNo(int number)
	{
		int originalNumber, remainder, result = 0;

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	          return  true;
	        else
	        return	false;
	}

}
