package Shafeeq_GUI;

import java.awt.*;
import java.awt.event.*;

public class EventCalc implements ActionListener 
{
	TextField box1;
	
	public EventCalc(TextField A)
	{
		box1 = A;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		double number = 0;
		Button buttonpressed = (Button)e.getSource();
		String input = buttonpressed.getLabel();
		
		try
		{
			switch(input)
			{
				case "+":
					Calculator.numberPlus = Double.parseDouble(box1.getText());
					box1.setText("");
					break;
				case "-":
					Calculator.numberMinus = Double.parseDouble(box1.getText());
					box1.setText("");
					break;
				case "x":
					Calculator.numberTimes = Double.parseDouble(box1.getText());
					box1.setText("");
					break;
				case "÷":
					Calculator.numberDivide = Double.parseDouble(box1.getText());
					box1.setText("");
					break;
				case "=":
					if(Calculator.numberPlus != 0)
					{
						number = Double.parseDouble(box1.getText());
						box1.setText(Double.toString(Calculator.numberPlus + number));
						Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
						break;
					}
					if(Calculator.numberMinus != 0)
					{
						number = Double.parseDouble(box1.getText());
						box1.setText(Double.toString(Calculator.numberMinus - number));
						Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
						break;
					}
					if(Calculator.numberTimes != 0)
					{
						number = Double.parseDouble(box1.getText());
						box1.setText(Double.toString(Calculator.numberTimes * number));
						Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
						break;
					}
					if(Calculator.numberDivide != 0)
					{
						number = Double.parseDouble(box1.getText());
						box1.setText(Double.toString(Calculator.numberDivide / number));
						Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
						break;
					}
					else
					{
						box1.setText("Invalid calculation.");
						break;
					}
				case "√":
					if(Double.parseDouble(box1.getText()) >= 0)
					{
						number = Double.parseDouble(box1.getText());
						box1.setText(Double.toString(Math.sqrt(number)));
						break;
					}
					else
					{
						box1.setText("Invalid calculation.");
						break;
					}
			}
		}
		catch(NumberFormatException exc)
		{
			box1.setText("Invalid calculation.");
		}
	}
}
