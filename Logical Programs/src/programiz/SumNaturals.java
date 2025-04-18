package programiz;

//Java Program to print the sum of natural numbers from '1' to 'n'
class SumNaturals
{
	public static void main(String[] args)
	{
		int num=100, sum=0;
		
		for(int i=1; i<=num; i++)//1<100->true, 2<100->true, 3<100->true
		{
			sum=sum+i;//1=0+1, 3=1+2, 6=3+3....
		}
		System.out.println("sum=" + sum); //5050
	}
}
