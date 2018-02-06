package Level_1_Basic;

public class ParametersOperators 
{
	public static void main(String[] args) 
	{		
		int n1 = 5;
		int n2 = 6;
		int n3 = returnMethod(n1, n2);
		System.out.println(n3);
	}
	public static int returnMethod(int n1, int n2)
	{
		return n1 + n2;
	}
}
