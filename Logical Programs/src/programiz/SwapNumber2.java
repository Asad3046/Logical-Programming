package programiz;

//Program to swap two numbers without using temporary variable

public class SwapNumber2
{
	public static void main(String[] args)
	{
		int first = 10, second = 20;

      System.out.println("--Before Swapping--");
      System.out.println("First number = " + first);
      System.out.println("Second number = " + second);
      System.out.println();

      first = first - second;  //10-20=10
      second = first + second; //10+20=30
      first = second - first;  //30-10=20

      System.out.println("--After Swapping--");
      System.out.println("First number = " + first);
      System.out.println("Second number = " + second);
  }
}
