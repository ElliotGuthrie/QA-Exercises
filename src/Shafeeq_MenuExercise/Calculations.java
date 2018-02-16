package Shafeeq_MenuExercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculations implements ActionListener
{
	JTextField T1, T2, T3;
	JButton Btn;
	JFrame F;
	JLabel L1, L2, L3, Lempty;
	
	public Calculations()
	{
		F = new JFrame();
		
		Btn = new JButton("Calculate");
		
		T1 = new JTextField(10);
		T2 = new JTextField(10);
		T3 = new JTextField(10);
		
		L1 = new JLabel("First Number:");
		L2 = new JLabel("Second Number:");
		L3 = new JLabel("Result");
		Lempty = new JLabel("");
		
		F.setLayout(new GridLayout(4, 2));
		
		Btn.addActionListener(this);
		
		F.add(L1); F.add(T1);
		F.add(L2); F.add(T2);
		F.add(Lempty); F.add(Btn);
		F.add(L3); F.add(T3);
		F.pack();
	}
	public void showWindow(String title)
	{
		F.setTitle(title);
		F.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		double A, B;
		String s;
		
		s = F.getTitle();
		
		try 
		{	
			A = Double.parseDouble(T1.getText());
			B = Double.parseDouble(T2.getText());		
			
		if(s.equals("Addition"))
			T3.setText(Double.toString(A + B));
		if(s.equals("Subtraction"))
			T3.setText(Double.toString(A - B));
		if(s.equals("Multiplication"))
			T3.setText(Double.toString(A * B));
		if(s.equals("Division"))
			T3.setText(Double.toString(A / B));
		}
		catch(Exception exc)
		{
			T3.setText("Invalid Input!");
		}
	}
}
