package Level_1_Basic;

import java.util.Random;

public class IterationArraysTwo 
{
	public static void main(String[] args)
	{
		int[] arrayOfInts = new int[10];
		Random randomNumberGenerator = new Random();
		
		System.out.println("Randomly Populating the Array");
		
		for(int i = 0; i < arrayOfInts.length; i++)
		{
			arrayOfInts[i] = randomNumberGenerator.nextInt(100);
			System.out.println(arrayOfInts[i]);
		}
		
		System.out.println("Now Multiplying by 10");
		
		for(int i = 0; i < arrayOfInts.length; i++)
		{
			arrayOfInts[i] = arrayOfInts[i]*10;
			System.out.println(arrayOfInts[i]);
		}
	}
}
