package Shafeeq_Binary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BinaryConverter 
{
	
	
	public static void main(String[] args) 
	{
		JFrame F;
		JTextField T1, T2;
		JButton BtoDeci, BtoBinary;
		
		F = new JFrame("Binary Converter");
		F.setLayout(new GridLayout(2,2));
		
		BtoBinary = new JButton("Convery to binary");
		BtoDeci = new JButton("Convert to decimal");
		
		T1 = new JTextField(10);
		T2 = new JTextField(10);
		T2.setEditable(false);
		
		F.add(T1); F.add(BtoBinary);
		F.add(T2); F.add(BtoDeci);
		
		F.setSize(400,90);
		F.setVisible(true);
		
		BtoDeci.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent E)
					{
						T2.setText("");
						String a = T1.getText();
						int b = 0;
						
						for(int i = a.length() - 1, p = 0; i >= 0; i--, p++)
						{
							b += (int) Math.pow(2, p) * Integer.parseInt(a.substring(i, i+1));
						}
						T2.setText(Integer.toString(b));
					}
				});
		BtoBinary.addActionListener(new ActionListener()
			{
				
				public void actionPerformed(ActionEvent E)
				{
					T2.setText("");
					int a, b;
					b = 0;
					a = Integer.parseInt(T1.getText());
						
					for(int i = 0; a >= 1; i++)
					{
						b = a%2;
						a = a/2;
						T2.setText(Integer.toString(b) + T2.getText());
					}					
				}
			});
	}
}
