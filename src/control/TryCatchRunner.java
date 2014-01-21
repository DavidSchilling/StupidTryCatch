package control;

public class TryCatchRunner
{
	public static void main(String[] args)
	{
		int testInteger = 15;
		double testDouble = 0.0000001;
		double errorTest = 0.0;
		int sherman = 0;
		
		try
		{
			testInteger = testInteger / sherman;
		}
		catch(ArithmeticException Robert)
		{
			System.out.println(Robert.getClass().toString());
			System.out.println("You are a fool, you tried to " + Robert.getMessage());
		}

		try
		{
			errorTest = testDouble/errorTest;
		}
		catch(ArithmeticException Ralph)
		{
			System.out.println(Ralph.getMessage());
			System.out.println(Ralph.getClass().toString());
		}
	}

}
