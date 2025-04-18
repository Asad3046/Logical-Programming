package mypackage;

class SwitchCaseDemo
{
	public static void main(String args[])
	{
		String str="second";
		switch(str)
		{
			case "First":
			case "first": System.out.println("90% and above");
			break;
			case "Second":
			case "second": System.out.println("80% and above");
			break;
			case "Third":
			case "third": System.out.println("70% and above");
			break;
			case "Fourth":
			case "fourth": System.out.println("60% and above");
			break;
			default: System.out.println("Fail");
		}
		System.out.println("out of switchcase");
	}
}
