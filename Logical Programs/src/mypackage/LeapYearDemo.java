package mypackage;

class LeapYearDemo
{
	public static void main(String args[])
	{
		int year=2100;
		if((year%4==0)&&(year%100!=0))
			System.out.println(year+" "+"is a leap year");
		else if(year%400==0)
			System.out.println(year+" "+"is a leap year");
		else
			System.out.println(year+" "+"is not a leap year");
	} 
}
