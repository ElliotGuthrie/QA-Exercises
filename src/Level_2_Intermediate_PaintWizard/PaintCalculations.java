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
		PaintCalculations paintCalcs = new PaintCalculations();
		int roomSize = 40;
		
		PaintProduct paint1 = new PaintProduct("CheapoMax", 20, 19.99, 10);
		PaintProduct paint2 = new PaintProduct("AverageJoes", 15, 17.99, 11);
		PaintProduct paint3 = new PaintProduct("DuluxourousPaints", 10, 25.00, 20);
		
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
		for(int i = 0; i < paints.size(); i++ )
		{
			double wastage = paintVolume - (roomSize / paintCoverage);
			System.out.println("For a room of size " + roomSize + "m^2, " + paintName + " will waste " + wastage + "L of paint.");
		}
	}
}
