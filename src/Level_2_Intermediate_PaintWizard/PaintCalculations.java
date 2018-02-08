package Level_2_Intermediate_PaintWizard;

import java.util.*;

public class PaintCalculations 
{
	private ArrayList<PaintProduct> paints;
	
	public PaintCalculations()
	{
		paints = new ArrayList<PaintProduct>();
	}
	public static void main(String[] args)
	{
		PaintCalculations paintCalc = new PaintCalculations();
		int roomSize = 40;
		
		PaintProduct paint1 = new PaintProduct("CheapoMax", 20, 19.99, 10);
		PaintProduct paint2 = new PaintProduct("AverageJoes", 15, 17.99, 11);
		PaintProduct paint3 = new PaintProduct("DuluxourousPaints", 10, 25.00, 20);
		
		PaintCalculations paintCalcs = new PaintCalculations();
		
		paintCalcs.addPaint(paint1);
		paintCalcs.addPaint(paint2);
		paintCalcs.addPaint(paint3);
	}
	public void addPaint(PaintProduct paints)
	{
		this.paints.add(paints);
	}
	public void wastageCalc(int roomSize, int paintVolume, int paintCoverage)
	{
		//Litres - roomSize/coverage = wastage
		for(int i = 0; i < paints.size(); i++ )
		{
			paintVolume();
		}
	}
}
