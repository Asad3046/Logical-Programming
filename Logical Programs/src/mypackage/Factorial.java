package mypackage;

/*
factorial
factor
sunnynumber
fibnonnai series(check given number is in fibnonnaci series or not)
collazt series
*/

class Factorial
{
	public static void main(String ar[])
	{
		int num=5,factorial=1;
		for(int i=num;i>0;i--) ////5>0, 4>0, 3>0, 2>0, 1>0
		{  
			factorial=factorial*i;//5=1*5, 20=5*4, 60=20*3, 120=60*2, 120=120*1 
		}
		System.out.println(factorial);
	}
}
