package com.Others;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Exit extends JPanel
{
	private static final long serialVersionUID = 1L;
	public Exit()
	{
		init();
		setBackground(Color.decode("#91eaf7"));
	}
	private void init() 
	{
		setPreferredSize(new Dimension(1105, 610));
		BorderLayout border = new BorderLayout();
		border.setHgap(10);
		setLayout(border);
	}

}
