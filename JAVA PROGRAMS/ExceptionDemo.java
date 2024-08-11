import java.lang.Exception;
import java.util.Scanner;
class ExceptionDemo extends Exception
{
	public ExceptionDemo(String str)
	{
		super(str);

	}
	public static void main(String args[])throws ExceptionDemo
	{
		System.out.println("Enter your age?");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			if(age>18)
			{
				throw new ExceptionDemo("You are eligible");
			}
			else
			{
			System.out.println("Not eligible");
			}
		}
		catch(ExceptionDemo ae)
		{
			ae.getMessage();
		}
		finally
		{
		System.out.println("End of the program");
		}
	}
}


			