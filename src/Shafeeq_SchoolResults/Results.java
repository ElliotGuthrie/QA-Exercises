package Shafeeq_SchoolResults;

public class Results 
{
	private int phy, che, mat;
	private float total, per;
	
	public void showResults()
	{
		total = phy + che + mat;
		per = total * 100 / 450;
		
		if(phy >= 90 && che >= 90 && mat >= 90)
		{
			System.out.printf("Marks: %.0f\n", total);
			System.out.printf("Percentage: %.2f%%", per);
		}
		else if(phy < 90 && che >= 90 && mat >= 90)
		{
			System.out.println("Retake the Physics exam.");
		}
		else if(phy >= 90 && che < 90 && mat >= 90)
		{
			System.out.println("Retake the Chemistry exam.");
		}
		else if(phy >= 90 && che >= 90 && mat < 90)
		{
			System.out.println("Retake the Mathematics exam.");
		}
		else if(phy < 90 && che < 90 && mat >= 90)
		{
			System.out.println("Repeat the course.");
		}
		else if(phy < 90 && che >= 90 && mat < 90)
		{
			System.out.println("Repeat the course.");
		}
		else if(phy >= 90 && che < 90 && mat < 90)
		{
			System.out.println("Repeat the course.");
		}
		else if(phy < 90 && che < 90 && mat < 90)
		{
			System.out.println("Go home.");
		}
	}
	public void physics(int A)
	{
		if(A >= 0 && A <= 150)
		{
			phy = A;
		}
		else
		{
			System.out.println("Invalid Physics results.");
		}
	}
	public void chemistry(int B)
	{
		if(B >= 0 && B <= 150)
		{
			che = B;
		}
		else
		{
			System.out.println("Invalid Chemistry results.");
		}
	}
	public void maths(int C)
	{
		if(C >= 0 && C <= 150)
		{
			mat = C;
		}
		else
		{
			System.out.println("Invalid Maths results.");
		}
	}
}
