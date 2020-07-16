package com.Employee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PersonalDetails extends JPanel 
{
	private static final long serialVersionUID = 1L;
	JPanel panelWest = new JPanel();
	JPanel panelCenter = new JPanel();
	
	public PersonalDetails()
	{
		init();
		cmp();
		setBackground(Color.blue);
	}
	private void cmp() 
	{
		
	}
	private void init() 
	{
		setPreferredSize(new Dimension(1105, 610));
		BorderLayout border = new BorderLayout();
		border.setHgap(0);
		setLayout(border);
	}
}
