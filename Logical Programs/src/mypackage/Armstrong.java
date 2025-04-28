package mypackage;

public class Armstrong
{

	public static void main(String[] args)
	{
		int number=153, originalNumber, remainder;
		originalNumber = number;
		double result = 0;
		int digits = String.valueOf(number).length(); //this will give you digits in the number
		
		while(number!=0)
		{
			remainder = number % 10; //3, 
			//result = result + Math.pow(remainder, digits);
			int power = 1;
			for(int i = 0; i < digits; i++)
			{
				power = power * remainder;
			}
			result = result + power;
			number = number / 10; //15, 
		}
		
		
		if(result == originalNumber)
		{
			System.out.println(originalNumber + " is an armstrong number.");
		}
		else
		{
			System.out.println(originalNumber + " is not an armstrong number.");
		}	
	}

}