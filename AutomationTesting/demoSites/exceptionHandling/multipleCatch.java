package exceptionHandling;

public class multipleCatch {
	public static void main(String[] args) {
		try {
		System.out.println("1");
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println("hgfvhjgadvjsa");
		}
		catch (ArithmeticException e) { //child
		e.printStackTrace();
		System.out.println("256----");
		}
		catch (Exception e) { //parent
		e.printStackTrace();
		System.out.println("256");
		}
		}
		}
