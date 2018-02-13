package Shafeeq_SchoolResults;

public class Results2
{
	private int phy, che, mat;
	private float total, per;
	
	public void showResults()
	{
		total = phy + che + mat;
		per = total * 100 / 450;
		int failed = 0;
		if(phy >= 90 && che >= 90 && mat >= 90)
		{
			System.out.printf("Marks: %.0f\n", total);
			System.out.printf("Percentage: %.2f%%", per);
		}
		if(phy < 90)
		{
			failed++;
			System.out.println("Retake the Physics exam.");
		}
		if(che < 90)
		{
			failed++;
			System.out.println("Retake the Chemistry exam.");
		}
		if(mat < 90)
		{
			failed++;
			System.out.println("Retake the Mathematics exam.");
		}
		if(failed == 2)
		{
			System.out.println("Repeat the course.");
		}
		if(failed == 3)
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
