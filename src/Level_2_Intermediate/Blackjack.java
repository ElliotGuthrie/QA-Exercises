package Level_2_Intermediate;

public class Blackjack 
{
	public static void main(String[] args) 
	{
		int n1 = 25;
		int n2 = 15;
		System.out.println(blackjackReturn(n1, n2));
	}
	public static int blackjackReturn(int n1, int n2)
	{
		if(n1 > 21 && n2 > 21)
			return 0;
		if(n1 < 1 && n2 < 1)
			return 0;
		if(n1 > 21 && n2 <= 21 && n2 > 0)
			return n2;
		if(n2 > 21 && n1 <= 21 && n1 > 0)
			return n1;
		if(n1 > n2 && n1 <= 21 && n1 > 0)
			return n1;
		if(n2 > n1 && n2 <= 21 && n1 > 0)
			return n2;
	
		return 0;
	}
}
