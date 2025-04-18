package programiz;

class Largest
{
	public static void main(String[] args)
	{
		int n1=18, n2=15, n3=20;
		if(n1>n2 && n1>n3)
			System.out.println(n1+" is the largest");
		else if(n2>n1 && n2>n3) 
			System.out.println(n2+" is the largest");
		else
			System.out.println(n3+" is the largest");
	}
}
