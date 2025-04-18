package mypackage;

class FactorOfNumber
{
	public static void main(String[] argument)
	{
		int num=72;
		System.out.println("1 is a factor of 72");
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+" is a factor of 72");
			}
		}
		System.out.println("72 is the factor of 72");
	}
}
