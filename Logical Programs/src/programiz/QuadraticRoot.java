package programiz;

class QuadraticRoot
{
	public static void main(String[] args)
	{
		double a=3, b=8, c=2;
		double root1,root2;
		
		double discriminant = b * b - 4 * a * c; //calculate the discriminant
		System.out.println(discriminant);
		if(discriminant > 0)
		{
			System.out.println("The roots are real and different");
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.println("root1 = "+root1);
			System.out.println("root2 = "+root2);
		}
		else if(discriminant == 0)
		{
			System.out.println("The roots are real and equal");
			
			root1 = root2 = -b;
			System.out.println("root1 = "+root1);
			System.out.println("root1 = "+root2);
		}
		else
		{
			System.out.println("The roots are complex and imaginary");
			
			
		}
	}
}
