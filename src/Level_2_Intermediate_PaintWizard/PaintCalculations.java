package Level_2_Intermediate_PaintWizard;

import java.util.*;

public class PaintCalculations
{
	private ArrayList<PaintProduct> paints;
	int roomSize = 40;
	
	public PaintCalculations()
	{
		paints = new ArrayList<PaintProduct>();
	}
	public static void main(String[] args)
	{
		PaintCalculations paintCalcs = new PaintCalculations();
		
		PaintProduct paint1 = new PaintProduct("CheapoMax", 20, 19.99, 10);
		PaintProduct paint2 = new PaintProduct("AverageJoes", 15, 17.99, 11);
		PaintProduct paint3 = new PaintProduct("DuluxourousPaints", 10, 25.00, 20);
		
		paintCalcs.addPaint(paint1);
		paintCalcs.addPaint(paint2);
		paintCalcs.addPaint(paint3);
		
		paintCalcs.wastageCalc();
	}
	public void addPaint(PaintProduct paints)
	{
		this.paints.add(paints);
	}
	public void wastageCalc()
	{
		for(int i = 0; i < paints.size(); i++ )
		{
			PaintProduct p = paints.get(i);
			double wastage = p.paintVolume - (roomSize / p.paintCoverage);
			System.out.println("For a room of size " + roomSize + "m^2, " + p.paintName + " will waste " + wastage + "L of paint.");
		}
	}
}
