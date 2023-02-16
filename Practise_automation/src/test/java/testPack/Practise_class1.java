package testPack;

public class Practise_class1 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 2;
		int c = 0 ;
		int d [] = {34,45,66,78};
		int i = 5;
		try 
		{
			c = a/b;
			System.out.println("hello");
			
		}
		catch (ArithmeticException e)
		{
			System.out.println(d[i]);
			System.out.println("arithmatic exception");
		}
		catch (ArrayIndexOutOfBoundsException x)
		{
			
			System.out.println("array index exception");
		}
		
		System.out.println(c);
		System.out.println("end");
		
	}
}
