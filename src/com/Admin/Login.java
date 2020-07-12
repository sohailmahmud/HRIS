package com.Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame  
{
	private static final long serialVersionUID = 1L;
	JFrame frame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panelNorth = new JPanel();
	JPanel panelSouth = new JPanel();
	JPanel panelWest = new JPanel();
	JPanel panelEast = new JPanel();
	JPanel panelCenter = new JPanel();
	JLabel lblLogo = new JLabel(new ImageIcon("icon/logo1.png"));
	JLabel lblLogin = new JLabel("Login Panel");
	JTextField txtUserName = new JTextField(15);
	JLabel lblUserName = new JLabel("Enter Username...");
	JPasswordField txtPassword = new JPasswordField(15);
	JLabel lblPassword = new JLabel("Enter Password...");
	JLabel lblUserIcon = new JLabel(new ImageIcon("icon/userlogo"));
	String ara[] = {"Select User Type","Admin","Super Admin","Manager","Executive","Employee"};
	JComboBox<String> cmbUserType = new JComboBox<>(ara);
	JCheckBox chkRemember = new JCheckBox();
	JLabel lblRemember = new JLabel("Remember me on this device.");
	JButton btnLogin = new JButton("Log In");
	JLabel lblForgotPassword = new JLabel("Forgot your username or password?");
	JLabel lblFooter = new JLabel("Copyright @ Human Resource Management System 2017. All Rights Reserved.");
	JLabel lblNeedHelp = new JLabel("Need Help?");
	BufferedImage image;
	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	
	public Login()
	{
		init();
		cmp();
		btnAction();
		lblUserName.setVisible(false);
		lblPassword.setVisible(false);
		txtUserName.setText("SohailSami");
		txtPassword.setText("@SohailMahmud#01011998");
	}
	private void btnAction() 
	{
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(checkValidation())
				{
					workingPanelAction();
				}
			}
		});
		txtUserName.addKeyListener(new KeyAdapter() 
		{
			public void keyTyped(KeyEvent e) 
			{
				if(!txtUserName.getText().trim().isEmpty())
				{
					lblUserName.setVisible(false);
				}
				else if(txtUserName.getText().equals(""))
				{
					lblUserName.setVisible(true);
				}
			}
			public void keyPressed(KeyEvent e) 
			{
				if(!txtUserName.getText().trim().isEmpty())
				{
					lblUserName.setVisible(false);
				}
				else if(txtUserName.getText().equals(""))
				{
					lblUserName.setVisible(true);
				}
				
			}
			public void keyReleased(KeyEvent e) 
			{
				if(!txtUserName.getText().trim().isEmpty())
				{
					lblUserName.setVisible(false);
				}
				else if(txtUserName.getText().equals(""))
				{
					lblUserName.setVisible(true);
				}
			}
		});
		txtPassword.addKeyListener(new KeyListener() {
			
			@SuppressWarnings("deprecation")
			public void keyTyped(KeyEvent e) 
			{
				if(!txtPassword.getText().trim().isEmpty())
				{
					lblPassword.setVisible(false);
				}
				else if(txtPassword.getText().equals(""))
				{
					lblPassword.setVisible(true);
				}
			}
			@SuppressWarnings("deprecation")
			public void keyPressed(KeyEvent e) 
			{
				if(!txtPassword.getText().trim().isEmpty())
				{
					lblPassword.setVisible(false);
				}
				else if(txtPassword.getText().equals(""))
				{
					lblPassword.setVisible(true);
				}
				
			}
			@SuppressWarnings("deprecation")
			public void keyReleased(KeyEvent e) 
			{
				if(!txtPassword.getText().trim().isEmpty())
				{
					lblPassword.setVisible(false);
				}
				else if(txtPassword.getText().equals(""))
				{
					lblPassword.setVisible(true);
				}
			}
		});
		this.addWindowListener(new WindowListener() 
		{
			public void windowOpened(WindowEvent arg0) {}
			public void windowIconified(WindowEvent arg0) {}
			public void windowDeiconified(WindowEvent arg0) {}
			public void windowDeactivated(WindowEvent arg0) {}
			public void windowClosing(WindowEvent arg0) 
			{
				int a = JOptionPane.showConfirmDialog(null, "Are you sure?\nyou want to exit now!","Confirm",JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else
				{
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
			public void windowClosed(WindowEvent arg0) {}
			public void windowActivated(WindowEvent arg0) {}
		});
	}
	private void workingPanelAction()
	{
		mainPanel.setVisible(false);
		WorkingPanel wp = new WorkingPanel(this);
		add(wp);
		wp.setVisible(true);
		setSize(screen);
		setLocationRelativeTo(null);
		setTitle("Welecome To Human Resource Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@SuppressWarnings("deprecation")
	private boolean checkValidation()
	{
		if(!txtUserName.getText().trim().isEmpty())
		{
			if(!txtPassword.getText().trim().isEmpty())
			{
				if(cmbUserType.getSelectedIndex()!=0 && cmbUserType.getSelectedItem()!=null)
				{
					return true;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Select an User Type!","warning",JOptionPane.WARNING_MESSAGE);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please Enter Password!","warning",JOptionPane.WARNING_MESSAGE);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please Enter User Name!","warning",JOptionPane.WARNING_MESSAGE);
		}
		return false;
	}
	private void cmp() 
	{
		add(mainPanel);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(panelNorth,BorderLayout.NORTH);
		panelNorthWork();
		mainPanel.add(panelSouth, BorderLayout.SOUTH);
		panelSouthWork();
		mainPanel.add(panelCenter, BorderLayout.CENTER);
		panelCenterWork();
		mainPanel.add(panelWest, BorderLayout.WEST);
		panelWestWork();
		mainPanel.add(panelEast, BorderLayout.EAST);
		panelEastWork();
	}
	private void panelNorthWork() 
	{
		panelNorth.setPreferredSize(new Dimension(1, 150));
		panelNorth.setBackground(Color.decode("#171414"));
		panelNorth.add(lblLogo);
	}
	private void panelCenterWork() 
	{
		panelCenter.setBackground(Color.decode("#91eaf7"));//#4fd4cd
		panelCenter.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		panelCenter.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 40, 20, 5);
		c.gridx=0;
		c.gridy=0;
		panelCenter.add(lblLogin,c);
		lblLogin.setFont(new Font("Algerian", Font.PLAIN+Font.BOLD, 30));
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 1;
		panelCenter.add(txtUserName, c);
		txtUserName.setBackground(Color.white);
		txtUserName.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 15));
		txtUserName.setPreferredSize(new Dimension(1, 35));
		txtUserName.setLayout(new BorderLayout());
		lblUserName.setForeground(Color.lightGray);
		lblUserName.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 18));
		txtUserName.add(lblUserName,BorderLayout.WEST);
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 2;
		panelCenter.add(txtPassword, c);
		txtPassword.setBackground(Color.white);
		txtPassword.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 15));
		txtPassword.setPreferredSize(new Dimension(1, 35));
		txtPassword.setLayout(new BorderLayout());
		lblPassword.setForeground(Color.lightGray);
		lblPassword.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 18));
		txtPassword.add(lblPassword,BorderLayout.WEST);
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 3;
		panelCenter.add(cmbUserType, c);
		cmbUserType.setBackground(Color.WHITE);
		cmbUserType.setPreferredSize(new Dimension(1, 32));
		cmbUserType.setSelectedItem("Super Admin");
		cmbUserType.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 13));
		c.insets = new Insets(1, 45, 1, 5);
		c.gridx = 0;
		c.gridy = 4;
		panelCenter.add(chkRemember, c);
		c.insets = new Insets(1, 70, 1, 5);
		c.gridx = 0;
		c.gridy = 4;
		panelCenter.add(lblRemember, c);
		c.insets = new Insets(5, 40, 5, 40);
		c.gridx = 0;
		c.gridy = 5;
		panelCenter.add(btnLogin, c);
		btnLogin.setBackground(Color.decode("#171414"));
		btnLogin.setForeground(Color.LIGHT_GRAY);//#4BC6C0
		btnLogin.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 25));
		btnLogin.setPreferredSize(new Dimension(1, 45));
		c.insets = new Insets(15, 50, 5, 5);
		c.gridx = 0;
		c.gridy = 6;
		panelCenter.add(lblForgotPassword, c);
		lblForgotPassword.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 13));
		lblForgotPassword.setForeground(Color.BLUE);
	}
	private void panelSouthWork() 
	{
		panelSouth.setLayout(new GridBagLayout());
		panelSouth.setPreferredSize(new Dimension(1, 100));
		panelSouth.setBackground(Color.decode("#171414"));
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(30, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelSouth.add(lblFooter,c);
		lblFooter.setForeground(Color.decode("#4fd4cd"));
		lblFooter.setFont(new Font("Pristina", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(5, 440, 5, 5);
		c.gridx = 0;
		c.gridy = 1;
		panelSouth.add(lblNeedHelp,c);
		lblNeedHelp.setForeground(Color.decode("#4fd4cd"));
		lblNeedHelp.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 12));
	}
	private void panelWestWork() 
	{
		panelWest.setPreferredSize(new Dimension(120, 1));
		panelWest.setBackground(Color.decode("#171414"));
	}
	private void panelEastWork() 
	{
		panelEast.setPreferredSize(new Dimension(120, 1));
		panelEast.setBackground(Color.decode("#171414"));
	}
	private void init()
	{
		setSize(580,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Access Panel");
		setResizable(false);
	}
}