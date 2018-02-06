package Level_1_Basic;

public class ReturnTypes 
{		
	
	public static void main(String[] args) 
	{
		String helloWorldTwo = returnMethod();
		System.out.println(helloWorldTwo);
	}
	public static String returnMethod() 
	{
		String helloWorldOne = "Hello World!";
		return helloWorldOne;
	}
}
