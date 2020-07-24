package com.Reports;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class RecruitmentReports extends JPanel
{
	private static final long serialVersionUID = 1L;

	public RecruitmentReports()
	{
		init();
		cmp();
		setBackground(Color.orange);
	}

	private void cmp() {
		// TODO Auto-generated method stub
		
	}

	private void init() 
	{
		setPreferredSize(new Dimension(1105, 610));
		BorderLayout border = new BorderLayout();
		border.setHgap(10);
		setLayout(border);
	}
}
