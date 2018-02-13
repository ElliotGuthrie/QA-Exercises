package Shafeeq_DigitsToWords;

public class DigitsToWords {
	private int input;
	private int first;
	private int second;
	private int third;
	private int fourth;
	private int fifth;
	private String firstDigit;
	private String secondDigit;
	private String thirdDigit;
	private String fourthDigit;
	private String fifthDigit;

	public void digitsToWords() 
	{
		fifth = input / 10000;
		fourth = (input / 1000) % 10;
		third = (input / 100) % 10;
		first = (input/10) % 10;
		second = input % 10;
		conversion();
		System.out.print(fifthDigit);
			if(fifth != 0 && (fourth == 0 || third == 0))
			{
				System.out.print("and ");
			}
		System.out.print(fourthDigit);
			if(fourth != 0 && third == 0)
			{
				System.out.print("and ");
			}
		System.out.print(thirdDigit);
			if(third != 0 && (first != 0 || second !=0))
			{
				System.out.print("and ");
			}
		System.out.print(firstDigit + secondDigit);
	}

	public void verifyInput(int A) 
	{
		if (A >= 0 && A <= 99999) 
		{
			input = A;
		} 
		else
		{
			System.out.println("Input is outside accepted range.");
		}
	}

	public void conversion()
	{
		if(fifth != 1)
		{
			switch(fifth)
			{
			case 0:
				fifthDigit = "";
				break;
			case 2:
				fifthDigit = "Twenty ";
				break;
			case 3:
				fifthDigit = "Thirty ";
				break;
			case 4:
				fifthDigit = "Forty ";
				break;
			case 5:
				fifthDigit = "Fifty ";
				break;
			case 6:
				fifthDigit = "Sixty ";
				break;
			case 7:
				fifthDigit = "Seventy ";
				break;
			case 8:
				fifthDigit = "Eighty ";
				break;
			case 9:
				fifthDigit = "Ninety ";
				break;
			}
		}
		else if(fifth == 1)
		{
			fifthDigit = "";
			switch(fifth)
			{
				case 0: 
					fifthDigit = "Ten Thousand ";
					break;
				case 1:
					fifthDigit = "Eleven Thousand ";
					break;
				case 2:
					fifthDigit = "Twelve Thousand ";
					break;
				case 3:
					fifthDigit = "Thirteen Thousand ";
					break;
				case 4:
					fifthDigit = "Fourteen Thousand ";
					break;
				case 5:
					fifthDigit = "Fifteen Thousand ";
					break;
				case 6:
					fifthDigit = "Sixteen Thousand ";
					break;
				case 7:
					fifthDigit = "Seventeen Thousand ";
					break;
				case 8:
					fifthDigit = "Eighteen Thousand ";
					break;
				case 9:
					fifthDigit = "Nineteen Thousand ";
					break;
			}
		}
		if(fifth != 1)
		{
		switch(fourth)
		{
			case 0:
				fourthDigit = "";
				break;
			case 1:
				fourthDigit = "One Thousand ";
				break;
			case 2:
				fourthDigit = "Two Thousand ";
				break;
			case 3:
				fourthDigit = "Three Thousand ";
				break;
			case 4:
				fourthDigit = "Four Thousand ";
				break;
			case 5:
				fourthDigit = "Five Thousand ";
				break;
			case 6:
				fourthDigit = "Six Thousand ";
				break;
			case 7:
				fourthDigit = "Seven Thousand ";
				break;
			case 8:
				fourthDigit = "Eight Thousand ";
				break;
			case 9:
				fourthDigit = "Nine Thousand ";
				break;
		}
		}
		else if(fifth == 1)
		{
			fourthDigit = "";
		}
		
		switch(third)
		{
			case 0:
				thirdDigit = "";
				break;
			case 1:
				thirdDigit = "One Hundred ";
				break;
			case 2:
				thirdDigit = "Two Hundred ";
				break;
			case 3:
				thirdDigit = "Three Hundred ";
				break;
			case 4:
				thirdDigit = "Four Hundred ";
				break;
			case 5:
				thirdDigit = "Five Hundred ";
				break;
			case 6:
				thirdDigit = "Six Hundred ";
				break;
			case 7:
				thirdDigit = "Seven Hundred ";
				break;
			case 8:
				thirdDigit = "Eight Hundred ";
				break;
			case 9:
				thirdDigit = "Nine Hundred ";
				break;
		}
		if(first != 1)
		{
			switch(first)
			{
				case 0: 
					firstDigit = "";
					break;
				case 2:
					firstDigit = "Twenty ";
					break;
				case 3:
					firstDigit = "Thirty ";
					break;
				case 4:
					firstDigit = "Forty ";
					break;
				case 5:
					firstDigit = "Fifty ";
					break;
				case 6:
					firstDigit = "Sixty ";
					break;
				case 7:
					firstDigit = "Seventy ";
					break;
				case 8:
					firstDigit = "Eighty ";
					break;
				case 9:
					firstDigit = "Ninety ";
					break;
			}	
			switch(second)
			{
				case 0: 
					secondDigit = "";
					break;
				case 1:
					secondDigit = "One";
					break;
				case 2:
					secondDigit = "Two";
					break;
				case 3:
					secondDigit = "Three";
					break;
				case 4:
					secondDigit = "Four";
					break;
				case 5:
					secondDigit = "Five";
					break;
				case 6:
					secondDigit = "Six";
					break;
				case 7:
					secondDigit = "Seven";
					break;
				case 8:
					secondDigit = "Eight";
					break;
				case 9:
					secondDigit = "Nine";
					break;
			}
		}
		else if(first == 1)
		{
			firstDigit = "";
			switch(second)
			{
				case 0: 
					secondDigit = "Ten";
					break;
				case 1:
					secondDigit = "Eleven";
					break;
				case 2:
					secondDigit = "Twelve";
					break;
				case 3:
					secondDigit = "Thirteen";
					break;
				case 4:
					secondDigit = "Fourteen";
					break;
				case 5:
					secondDigit = "Fifteen";
					break;
				case 6:
					secondDigit = "Sixteen";
					break;
				case 7:
					secondDigit = "Seventeen";
					break;
				case 8:
					secondDigit = "Eighteen";
					break;
				case 9:
					secondDigit = "Nineteen";
					break;
			}
		}
	}
}
