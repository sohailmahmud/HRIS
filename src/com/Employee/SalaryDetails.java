package com.Employee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class SalaryDetails extends JPanel
{
	private static final long serialVersionUID = 1L;

	public SalaryDetails()
	{
		init();
		cmp();
		setBackground(Color.DARK_GRAY);
	}
	private void cmp() 
	{
		
	}
	private void init() 
	{
		setPreferredSize(new Dimension(1105, 610));
		BorderLayout border = new BorderLayout();
		border.setHgap(10);
		setLayout(border);
	}
}
