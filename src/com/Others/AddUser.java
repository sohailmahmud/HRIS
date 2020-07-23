package com.Others;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class AddUser extends JPanel
{
	private static final long serialVersionUID = 1L;
	public AddUser()
	{
		init();
		setBackground(Color.WHITE);
	}
	private void init() 
	{
		setPreferredSize(new Dimension(1105, 610));
		BorderLayout border = new BorderLayout();
		setLayout(border);
	}

}
