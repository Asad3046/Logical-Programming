package patterns;

class PatternTwo
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)//5, 4, 3, 2, 1,
		{
			for(int j=1;j<=i;j++)//1, 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
