package com.Others;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class LogOff extends JPanel
{
	private static final long serialVersionUID = 1L;

	public LogOff()
	{
		setPreferredSize(new Dimension(1105, 610));
		BorderLayout border = new BorderLayout();
		border.setHgap(10);
		setLayout(border);
	}
}
