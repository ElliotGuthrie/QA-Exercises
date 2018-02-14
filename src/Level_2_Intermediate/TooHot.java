package Level_2_Intermediate;

public class TooHot 
{
	public static void main(String[] args) 
	{
		int temp = 100;
		boolean isSummer = true;
		System.out.println(tempReturn(temp, isSummer));
	}
	public static String tempReturn(int temp, boolean isSummer)
	{
		if(60 <= temp && temp <= 100 && isSummer)
			return "True";
		if(60 <= temp && temp <= 90 && !isSummer)
			return "True";
		else
			return "False";
	}
}
