
public class Arrays 
{
	public static void main(String[] args) 
	{
		int[] arrayOfInts = {2, 7, 12 , 18, 19, 21, 25, 28, 30, 37};
		int n1 = 3;
		
		
		for(int i = 0; i < arrayOfInts.length; i++)
		{
			int n2 = returnMethod(n1, arrayOfInts[i]);
			System.out.println(n2);
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