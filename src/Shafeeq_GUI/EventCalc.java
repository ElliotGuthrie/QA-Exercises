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
		float number = 0;
		Button buttonpressed = (Button)e.getSource();
		String input = buttonpressed.getLabel();
		
		switch(input)
		{
			case "+":
				Calculator.numberPlus = Float.parseFloat(box1.getText());
				box1.setText("");
				break;
			case "-":
				Calculator.numberMinus = Float.parseFloat(box1.getText());
				box1.setText("");
				break;
			case "x":
				Calculator.numberTimes = Float.parseFloat(box1.getText());
				box1.setText("");
				break;
			case "÷":
				Calculator.numberDivide = Float.parseFloat(box1.getText());
				box1.setText("");
				break;
			case "=":
				if(Calculator.numberPlus != 0)
				{
					number = Float.parseFloat(box1.getText());
					box1.setText(Float.toString(Calculator.numberPlus + number));
					Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
					break;
				}
				if(Calculator.numberMinus != 0)
				{
					number = Float.parseFloat(box1.getText());
					box1.setText(Float.toString(Calculator.numberMinus - number));
					Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
					break;
				}
				if(Calculator.numberTimes != 0)
				{
					number = Float.parseFloat(box1.getText());
					box1.setText(Float.toString(Calculator.numberTimes * number));
					Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
					break;
				}
				if(Calculator.numberDivide != 0)
				{
					number = Float.parseFloat(box1.getText());
					box1.setText(Float.toString(Calculator.numberDivide / number));
					Calculator.numberPlus = Calculator.numberMinus = Calculator.numberTimes = Calculator.numberDivide = 0;
					break;
				}
				else
				{
					box1.setText("Invalid calculation.");
					break;
				}		
		}
	}
}
