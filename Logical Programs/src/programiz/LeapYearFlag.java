package programiz;

class LeapYearFlag
{
	public static void main(String[] args)
	{
		int year = 1900;
		boolean flag = false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					flag = true;
				else
					flag = false;
			}
			else
				flag = true;
		}
		else
			flag = false;
		
		if(flag == true)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
	}
}
