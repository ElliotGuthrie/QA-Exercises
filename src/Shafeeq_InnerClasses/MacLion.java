package Shafeeq_InnerClasses;

import java.awt.event.*;
import javax.swing.*;

public class MacLion 
{
	public static void main(String[] args) 
	{
		JFrame mac = new JFrame();
		
		JTextField T1 = new JTextField(10);
		JTextField T2 = new JTextField(10);
		JTextField T3 = new JTextField(10);
		
		JButton B1 = new JButton("+");
		JButton B2 = new JButton("-");
		JButton B3 = new JButton("x");
		JButton B4 = new JButton("/");
		
		B1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent E)
			{
				double a, b, c;
				a = Double.parseDouble(T1.getText());
				b = Double.parseDouble(T2.getText());
				c = a + b;
				T3.setText(Double.toString(c));
			}
		});
		B2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent E)
			{
				double a, b, c;
				a = Double.parseDouble(T1.getText());
				b = Double.parseDouble(T2.getText());
				c = a - b;
				T3.setText(Double.toString(c));
			}
		});
		B3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent E)
			{
				double a, b, c;
				a = Double.parseDouble(T1.getText());
				b = Double.parseDouble(T2.getText());
				c = a * b;
				T3.setText(Double.toString(c));
			}
		});
		B4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent E)
			{
				double a, b, c;
				a = Double.parseDouble(T1.getText());
				b = Double.parseDouble(T2.getText());
				c = a / b;
				T3.setText(Double.toString(c));
			}
		});
	}
}
