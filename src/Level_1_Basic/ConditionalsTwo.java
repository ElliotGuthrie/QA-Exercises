package Level_1_Basic;

public class ConditionalsTwo 
{
	public static void main(String[] args) 
	{	
		int n1 = 2;
		int n2 = 6;
		System.out.println(returnMethod(n1, n2));
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