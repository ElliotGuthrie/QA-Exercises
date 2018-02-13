package Shafeeq_Exceptions;

import java.util.Arrays;

public class StringProcessing 
{
	String msg, find, replace;

	public static void main(String[] args) 
	{
		printMessage1("Hello there");
		
		System.out.println("\n");
		
		wordCount1("I have come in peace");
		
		System.out.println("\n");
		
		wordPerLine1("I am going to London");
		
		System.out.println("\n");
		
		reverseWordPerLine1("I am going to London");
		
		System.out.println("\n");
		
		findAndReplace1("I am going to London", "o", "**");
	}
	public static void printMessage1(String msg)
	{
		for(int i = 0; i < msg.length(); i++)
		{
			System.out.println(msg.substring(i, i + 1));
		}
	}
	public static void wordCount1(String msg)
	{
		int spaceCount = 0;
		for(int i = 0; i < msg.length(); i++)
		{
			if(Character.isWhitespace(msg.charAt(i)))
				spaceCount++;
		}	
		System.out.println(spaceCount + 1);
	}
	public static void wordPerLine1(String msg)
	{
		for(int i = 0; i < msg.length(); i++)
		{
			if(Character.isWhitespace(msg.charAt(i)))
			{
				System.out.println("");
			}
			else
			{
				System.out.print(msg.substring(i, i + 1));
			}
		}
	}
	public static void reverseWordPerLine1(String msg)
	{
		StringBuilder reverse = new StringBuilder(msg.length() + 1);
	    String[] forLoopMsg = msg.split(" ");
	    for (int i = forLoopMsg.length - 1; i >= 0; i--) 
	    {
	        reverse.append(forLoopMsg[i]).append(' ');
	    }
	    reverse.setLength(reverse.length() - 1); 
	    reverse.toString();
	    
	    for(int i = 0; i < reverse.length(); i++)
		{
			if(Character.isWhitespace(reverse.charAt(i)))
			{
				System.out.println("");
			}
			else
			{
				System.out.print(reverse.substring(i, i + 1));
			}
		}
	}
	public static void findAndReplace1(String msg, String find, String replace)
	{
		//String newmsg = msg.replaceAll(find, replace); //simplest method could come up with
		//System.out.println(newmsg);
		
		String[] msgarray = msg.split(" ");
		
		for(int i = 0; i < msgarray.length; i++)
		{
			msgarray[i] = msgarray[i].replace(find , replace);
			System.out.print(msgarray[i] + " ");
		}
		
		//System.out.println(Arrays.toString(msgarray)); //printint out the changed array to check what had happened
	}
}