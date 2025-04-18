package programiz;

import java.util.Scanner;

class VowelConsonant
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the alphabet: ");
		char ch=sc.nextLine().charAt(0); //to take input from the user as character
		//char ch='e';
		sc.close();
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is consonant");
	}
}
