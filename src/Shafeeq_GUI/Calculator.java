package Shafeeq_GUI;

import java.awt.*;

public class Calculator 
{
	static double number, numberPlus, numberMinus, numberTimes, numberDivide;
	
	public static void main(String[] args) 
	{
		Frame win = new Frame("Jesus Christ, it's Jason Bourne the calculator!");
		
		Panel p1, p2, p3;
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		Button B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, Bplus, Bminus, Btimes, Bdivide, Bequals, Bcancel, Bdecimal, Broot;
		
		B0 = new Button("0");
		B1 = new Button("1");
		B2 = new Button("2");
		B3 = new Button("3");
		B4 = new Button("4");
		B5 = new Button("5");
		B6 = new Button("6");
		B7 = new Button("7");
		B8 = new Button("8");
		B9 = new Button("9");
		Bplus = new Button("+");
		Bminus = new Button("-");
		Btimes = new Button("x");
		Bdivide = new Button("÷");
		Bequals = new Button("=");
		Bcancel = new Button("CE");
		Bdecimal = new Button(".");
		Broot = new Button("√");
		
		TextField T1;
		
		T1 = new TextField(40);
		T1.setEditable(false);

		EventNumber Enum = new EventNumber(T1);
		EventCalc Ecalc = new EventCalc(T1);
		EventCancel Ecanc = new EventCancel(T1);
		
		addToEnum(Enum, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, Bdecimal);
		addToEcalc(Ecalc, Bplus, Bminus, Btimes, Bdivide, Bequals, Broot);
		addToEcanc(Ecanc, Bcancel);
		
		FlowLayout F = new FlowLayout();
		GridLayout G44 = new GridLayout(4,4);
		GridLayout G21 = new GridLayout(2,1);
		
		win.add(p1, BorderLayout.NORTH);
		win.add(p2, BorderLayout.CENTER);
		win.add(p3, BorderLayout.EAST);
		
		p1.setLayout(F);
		p2.setLayout(G44);
		p3.setLayout(G21);
		
		panelAddAll(p1, T1);	
		panelAddAll(p2, B7, B8, B9, Bdivide, B4, B5, B6, Btimes, B1, B2, B3, Bminus, Bdecimal, B0, Broot, Bplus);
		panelAddAll(p3, Bcancel, Bequals);
		
		win.setSize(350, 320);
		win.setVisible(true);
		
	}
	public static void addToEnum(EventNumber Enum, Button... buttons)
	{	
		for(Button b : buttons) 
		{
			b.addActionListener(Enum);
		}
	}
	public static void addToEcalc(EventCalc Ecalc, Button... buttons)
	{
		for(Button b : buttons) 
		{
			b.addActionListener(Ecalc);
		}
	}
	public static void addToEcanc(EventCancel Ecanc, Button Bcanc)
	{
			Bcanc.addActionListener(Ecanc);
	}
	public static void panelAddAll(Panel p, Component... components) 
	{
		for(Component c : components)
		{
			p.add(c);
		}
	}
}
