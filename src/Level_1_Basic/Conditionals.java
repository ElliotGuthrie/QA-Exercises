package Level_1_Basic;

public class Conditionals 
{
	public static void main(String[] args) 
	{	
		boolean atQA = true;
		int n1 = 2;
		int n2 = 6;
		int n3 = returnMethod(n1, n2, atQA);
		System.out.println(n3);
	}
	public static int returnMethod(int n1, int n2, boolean atQA)
	{
		if(atQA) 
		{
			return n1 + n2;
		}
		else
		{
			return n1 * n2;
		}
	}
}
