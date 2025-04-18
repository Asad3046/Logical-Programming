package programiz;

class SwapNumber1
{
	public static void main(String[] args)
	{
		int firstNum=5, secondNum=10;
		
		System.out.println("--Before Swapping--");
		System.out.println("firstNum :"+firstNum);
		System.out.println("secondNum :"+secondNum);
		System.out.println();
		
		int temp=firstNum;
		firstNum=secondNum;
		secondNum=temp;
		
		System.out.println("--After Swapping--");
		System.out.println("firstNum :"+firstNum);
		System.out.println("secondNum :"+secondNum);

	}
}
