package programiz;

//Program to print an integer(Entered by user)

import java.util.Scanner;

class UserInputOutput
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); //object creation
		
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("You entered: "+num);
		sc.close();
	}
}
