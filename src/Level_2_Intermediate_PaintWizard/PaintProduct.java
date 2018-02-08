package Level_2_Intermediate_PaintWizard;

public class PaintProduct 
{
	public String paintName;
	public int paintVolume;
	public double paintCost;
	public int paintCoverage;

	public PaintProduct(String paintName, int paintVolume, double paintCost, int paintCoverage)
	{
		this.paintName = paintName;
		this.paintVolume = paintVolume;
		this.paintCost = paintCost;
		this.paintCoverage = paintCoverage;
	}
	public String getPaintName() 
	{
		return paintName;
	}
	public void setPaintName(String paintName) 
	{
		this.paintName = paintName;
	}
	public int getPaintVolume() 
	{
		return paintVolume;
	}
	public void setPaintVolume(int paintVolume) 
	{
		this.paintVolume = paintVolume;
	}
	public double getPaintCost() 
	{
		return paintCost;
	}
	public void setPaintCost(int paintCost) 
	{
		this.paintCost = paintCost;
	}
	public int getPaintCoverage()
	{
		return paintCoverage;
	}
	public void setPaintCoverage(int paintCoverage)
	{
		this.paintCoverage = paintCoverage;
	}
}
