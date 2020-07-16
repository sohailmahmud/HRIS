package com.Main;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.Admin.Login;

public class HumanResource 
{
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Project Theme Not Loaded!","Error",JOptionPane.ERROR_MESSAGE);
		}
		Login lg = new Login();
		ImageIcon hover = new ImageIcon("icon/hover.png");
		lg.setIconImage(hover.getImage());
	}
}
