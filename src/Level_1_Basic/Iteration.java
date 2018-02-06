package Level_1_Basic;

public class Iteration 
{
	public static void main(String[] args) 
	{
		int n1 = 4;
		int n2 = 6;
		int n3 = returnMethod(n1, n2);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(returnMethod(n3, i*i));
		}
	}
	public static int returnMethod(int n1, int n2)
	{
		if(n1 < 1) 
		{
			return n2;
		}
		else if(n2 < 1)
		{
			return n1;
		}
		else
		{
			return n1 + n2;
		}
	}
}
