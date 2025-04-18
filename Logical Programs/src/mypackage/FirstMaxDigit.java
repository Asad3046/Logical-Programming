package mypackage;

class FirstMaxDigit
{
	public static void main(String args[])
	{
		int num=24763,fmax=0,rem=0;
		while(num>0)
		{
			rem=num%10;//9, 6, 5, 4, 2
			num=num/10;//2456, 245, 24, 2, 0
			if(rem>fmax)//9>0
			{
				fmax=rem;//fmax=9, 
			}
		}
		System.out.println(fmax);
	}
}
