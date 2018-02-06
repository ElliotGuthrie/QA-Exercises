package Level_2_Intermediate;

public class Blackjack 
{
	public static void main(String[] args) 
	{
		int n1 = 20;
		int n2 = 18;
		System.out.println(blackjackReturn(n1, n2));
	}
	public static int blackjackReturn(int n1, int n2)
	{
		if(n1 - n2 > 0)
		{
			return n1;
		}
		else if(n1 - n2 < 0)
		{
			return n2;
		}
		else
		{
			return 0;
		}
	}
}
