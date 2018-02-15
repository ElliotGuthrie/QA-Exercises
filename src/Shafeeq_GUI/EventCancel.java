package Shafeeq_GUI;

import java.awt.*;
import java.awt.event.*;

public class EventCancel implements ActionListener 
{
	TextField box1;
	float number;
	
	public EventCancel(TextField A)
	{
		box1 = A;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			box1.setText("");
			number = 0;
			Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
		}
		catch(Exception exc)
		{
			box1.setText("Invalid calculation.");
		}
	}
}
