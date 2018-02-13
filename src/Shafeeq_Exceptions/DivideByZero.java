package Shafeeq_Exceptions;

public class DivideByZero 
{
	public static void main(String[] args)
	{
		int A;
		try
		{
			A = 4/0;
			System.out.println(A);
		}
		catch(ArithmeticException Z)
		{
			System.out.println("Mandem cannot divide by zero fam.");
		}
	}
}