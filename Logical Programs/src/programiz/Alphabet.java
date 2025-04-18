package programiz;

//Java program to check whether given character is an alphabet or not

class Alphabet
{
	public static void main(String[] args)
	{
		char c = 'g';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			System.out.println(c + " is an alphabet");
		else
			System.out.println(c + " is not an alphabet");
	}
}