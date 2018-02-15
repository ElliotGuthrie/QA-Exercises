package Shafeeq_GUI;

import java.awt.*;
import java.awt.event.*;

public class EventNumber implements ActionListener 
{
	TextField box1;
	
	public EventNumber(TextField A)
	{
		box1 = A;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Button buttonpressed = (Button)e.getSource();
		String input = buttonpressed.getLabel();
		
		try
		{
			if(box1.getText().equals("Invalid calculation."))
			{
				box1.setText("");
			}		
			switch(input)
			{
				case "0":
					box1.setText(box1.getText() + "0");
					break;
				case "1":
					box1.setText(box1.getText() + "1");
					break;
				case "2":
					box1.setText(box1.getText() + "2");
					break;
				case "3":
					box1.setText(box1.getText() + "3");
					break;
				case "4":
					box1.setText(box1.getText() + "4");
					break;
				case "5":
					box1.setText(box1.getText() + "5");
					break;
				case "6":
					box1.setText(box1.getText() + "6");
					break;
				case "7":
					box1.setText(box1.getText() + "7");
					break;
				case "8":
					box1.setText(box1.getText() + "8");
					break;
				case "9":
					box1.setText(box1.getText() + "9");
					break;
				case ".":
					if(box1.getText().indexOf(".") == -1)
					{
						box1.setText(box1.getText() + ".");
						break;
					}
					else
						break;
			}
		}
		catch(Exception exc)
		{
			box1.setText("Invalid calculation.");
		}
	}
}
