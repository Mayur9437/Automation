package exceptionHandling;

public class MrthodsTOPrintng {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			}
			catch(Exception e)
			{
			e.printStackTrace(); //best way most preferred way to print exception
			//ExceptionName
			//Description
			//StackTrace
			System.out.println("===============");
			System.out.println(e);
			//ExceptionName
			//Description
			System.out.println("===============");
			System.out.println(e.getMessage());
			//Description
			}
			}
			}
	
