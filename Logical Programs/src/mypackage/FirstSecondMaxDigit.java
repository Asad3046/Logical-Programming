package mypackage;

class FirstSecondMaxDigit
{
	public static void main(String args[])
	{
		int num=82456,fmax=0,smax=0,rem=0;
		while(num>0)
		{
			rem=num%10; //6, 5, 4, 2, 8 
			num=num/10; //8245, 824, 82, 8
			if(rem>fmax) //6>0, 5>6, 4>6, 2>6, 8>6
			{
				smax=fmax; //smax=6
				fmax=rem; //fmax=8
			}
			else if(rem>smax)
			{
				smax=rem;
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}
}
