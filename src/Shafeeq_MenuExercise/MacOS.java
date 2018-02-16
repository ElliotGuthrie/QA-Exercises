package Shafeeq_MenuExercise;

import java.awt.event.*;
import javax.swing.*;

public class MacOS implements ActionListener
{
	JMenuItem itemAdd, itemSub, itemMult, itemDiv, itemExit;
	Calculations calc;
	
	public MacOS()
	{
		JFrame window = new JFrame("Mac OS");
		JMenuBar menuBar = new JMenuBar();
		JMenu maths = new JMenu("Maths");
		itemAdd = new JMenuItem("Addition");
		itemSub = new JMenuItem("Subtraction");
		itemMult = new JMenuItem("Multiplication");
		itemDiv = new JMenuItem("Division");
		itemExit = new JMenuItem("Exit");
		
		itemAdd.addActionListener(this);
		itemSub.addActionListener(this);
		itemMult.addActionListener(this);
		itemDiv.addActionListener(this);
		itemExit.addActionListener(this);
		
		maths.add(itemAdd);
		maths.add(itemSub);
		maths.add(itemMult);
		maths.add(itemDiv);
		maths.add(itemExit);
		
		menuBar.add(maths);
		
		window.setJMenuBar(menuBar);
		window.setSize(400, 400);
		window.setVisible(true);
		
		calc = new Calculations();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JMenuItem I = (JMenuItem)e.getSource();
		
		if(I == itemAdd)
			calc.showWindow("Addition");
		if(I == itemSub)
			calc.showWindow("Subtraction");
		if(I == itemMult)
			calc.showWindow("Multiplication");
		if(I == itemDiv)
			calc.showWindow("Division");
		if(I == itemExit)
			System.exit(0);
	}
}
