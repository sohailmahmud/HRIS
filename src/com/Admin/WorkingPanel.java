package com.Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.Announcements.AnnouncementDetails;
import com.Announcements.AnnouncementMail;
import com.Attendance.DailyAttendance;
import com.Attendance.MonthlyAttendance;
import com.Employee.AddEmployee;
import com.Employee.JobDetails;
import com.Employee.PersonalDetails;
import com.Employee.SalaryDetails;
import com.Leaves.EmployeeLeaves;
import com.Leaves.LeaveApplication;
import com.Loans.EmployeeLoan;
import com.Loans.LoanApplication;
import com.Others.AddUser;
import com.Others.ChangePassword;
import com.Others.Exit;
import com.Others.LogOff;
import com.Payroll.AttendanceDetails;
import com.Payroll.LeaveDetails;
import com.Payroll.SalaryStructure;
import com.Recruitements.RecruitmentDetails;
import com.Recruitements.Register;
import com.Reports.EmployeeReports;
import com.Reports.HrReports;
import com.Reports.PayrollReports;
import com.Reports.RecruitmentReports;
import com.Reports.TrainingReports;
import com.Trainings.EmployeeTraining;
import com.Trainings.TrainingEvent;

public class WorkingPanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	JFrame frame = new JFrame();
	JPanel panelNorth = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel panelCenterWest = new JPanel();
	JPanel panelCenterWestNorth = new JPanel();
	JPanel panelCenterWestCenter = new JPanel();
	JPanel panelcenterWestSouth = new JPanel();
	JPanel panelCenterCenter = new JPanel();
	JPanel panelCenterCenterMirror = new JPanel(); 
	JPanel panelBackground = new JPanel();
	JPanel panelEmployee = new JPanel();
	JPanel panelAttendance = new JPanel();
	JPanel panelPayroll = new JPanel();
	JPanel panelLeaves = new JPanel();
	JPanel panelRecruitements = new JPanel();
	JPanel panelLoan = new JPanel();
	JPanel panelReports = new JPanel();
	JPanel panelTrainings = new JPanel();
	JPanel panelAnnouncements = new JPanel();
	JPanel panelOthers = new JPanel();
	AddEmployee addEmployee = new AddEmployee();
	PersonalDetails personalDetails = new PersonalDetails();
	JobDetails jobDetails = new JobDetails();
	SalaryDetails salaryDetails = new SalaryDetails();
	DailyAttendance dailyAttendance = new DailyAttendance();
	MonthlyAttendance monthlyAttendance = new MonthlyAttendance();
	SalaryStructure salaryStructure = new SalaryStructure();
	AttendanceDetails attendanceDetails = new AttendanceDetails();
	LeaveDetails leaveDetails = new LeaveDetails();
	EmployeeLeaves employeeLeaves = new EmployeeLeaves();
	LeaveApplication leaveApplication = new LeaveApplication();
	Register register = new Register();
	RecruitmentDetails recruitmentDetails = new RecruitmentDetails();
	EmployeeLoan employeeLoan = new EmployeeLoan();
	LoanApplication loanApplication = new LoanApplication();
	HrReports hrReprots = new HrReports();
	RecruitmentReports recruitmentReports = new RecruitmentReports();
	EmployeeReports employeeReports = new EmployeeReports();
	PayrollReports payrollReports = new PayrollReports();
	TrainingReports trainingReports = new TrainingReports();
	EmployeeTraining employeeTraining = new EmployeeTraining();
	TrainingEvent trainingEvent = new TrainingEvent();
	AnnouncementDetails announcementDetails = new AnnouncementDetails();
	AnnouncementMail announcementMail = new AnnouncementMail();
	AddUser addUser = new AddUser();
	ChangePassword changePassword = new ChangePassword();
	LogOff logOff = new LogOff();
	Exit exit = new Exit();
	JLabel lblTitle = new JLabel(new ImageIcon("icon/mainLogo.png"));
	JLabel lblEmployee = new JLabel("Employee");
	JLabel lblLeaves = new JLabel("Leaves");
	JLabel lblPayroll = new JLabel("Payroll");
	JLabel lblAttendence = new JLabel("Attendance");
	JLabel lblRecruitment = new JLabel("Recruitements");
	JLabel lblLoan = new JLabel("Loans");
	JLabel lblReports = new JLabel("Reports");
	JLabel lblTrainings = new JLabel("Trainings");
	JLabel lblAnnouncements = new JLabel("Announcements");
	JLabel lblOthers = new JLabel("Others");
	JButton btnEmployee = new JButton(new ImageIcon("icon/Employee.png"));
	JButton btnLeaves = new JButton(new ImageIcon("icon/Leaves.png"));
	JButton btnPayroll = new JButton(new ImageIcon("icon/Payroll.png"));
	JButton btnAttendance = new JButton(new ImageIcon("icon/Attendance.png"));
	JButton btnRecruitment = new JButton(new ImageIcon("icon/Recruitments.png"));
	JButton btnLoan = new JButton(new ImageIcon("icon/Loan1.png"));
	JButton btnReports = new JButton(new ImageIcon("icon/Reports.png"));
	JButton btnTrainings = new JButton(new ImageIcon("icon/Trainings.png"));
	JButton btnAnnouncements = new JButton(new ImageIcon("icon/Announcements.png"));
	JButton btnOthers = new JButton(new ImageIcon("icon/Others.png"));
	JLabel lblHome = new JLabel(new ImageIcon("icon/home.png"));
	JButton btnBackward = new JButton(new ImageIcon("icon/back.png"));
	JLabel lblEmployeeHome = new JLabel("Employee");
	JLabel lblAttendanceHome = new JLabel("Attendance");
	JLabel lblPayrollHome = new JLabel("Payroll");
	JLabel lblLeaveHome = new JLabel("Leaves");
	JLabel lblRecruitmentHome = new JLabel("Recruitments");
	JLabel lblLoanHome = new JLabel("Loans");
	JLabel lblReportHome = new JLabel("Reports");
	JLabel lblTrainingHome = new JLabel("Training");
	JLabel lblAnnouncementHome = new JLabel("Announcements");
	JLabel lblOthersHome = new JLabel("Others");
	JButton btnAddEmployee = new JButton("   Add New Employee            ",new ImageIcon("icon/addEmployee.png"));
	JButton btnPersonalDetails = new JButton("Employee Personal Details",new ImageIcon("icon/EmployeePersonalDetails.png"));
	JButton btnJobDetails = new JButton("  Employee Job Details         ",new ImageIcon("icon/EmployeeJobDetails.png"));
	JButton btnSalaryDetails = new JButton(" Employee Salary Details    ",new ImageIcon("icon/EmployeeSalaryDetails.png"));
	JButton btnMonthlyReport = new JButton("Monthly Attendance Report", new ImageIcon("icon/MonthlyReport.png"));
	JButton btnDailyReport = new JButton(" Daily Attendance Report      ", new ImageIcon("icon/DailyReport.png"));
	JButton btnSalaryStructure = new JButton(" Salary Structure    ", new ImageIcon("icon/SalaryStructure.png"));
	JButton btnAttendanceDetails = new JButton("Attendance Details", new ImageIcon("icon/AttendanceDetails.png"));
	JButton btnLeaveDetails = new JButton("    Leave Details          ", new ImageIcon("icon/LeaveDetails.png"));
	JButton btnEmployeeLeaves = new JButton(" Employee Leaves  ", new ImageIcon("icon/EmployeeLeaves.png"));
	JButton btnLeaveApplication = new JButton(" Leave Application ", new ImageIcon("icon/LeaveApplication.png"));
	JButton btnRegister = new JButton("     Register                  ", new ImageIcon("icon/RecruitmentRegister.png"));
	JButton btnRecruitmentDetails = new JButton("Recruitment Details", new ImageIcon("icon/RecruitmentDetails.png"));
	JButton btnEmployeeLoan = new JButton(" Employee Loan   ", new ImageIcon("icon/EmployeeLoan.png"));
	JButton btnLoanApplication = new JButton("Loan Application ", new ImageIcon("icon/LoanApplication.png"));
	JButton btnHrReports = new JButton("      HR Reports              ", new ImageIcon("icon/HrReports.png"));
	JButton btnRecruitmentReport = new JButton(" Recruitment Reports", new ImageIcon("icon/RecruitmentReports.png"));
	JButton btnEmployeeReport = new JButton("  Employee Reports     ", new ImageIcon("icon/EmployeeReports.png"));
	JButton btnPayrollReport = new JButton("  Payroll Reports           ", new ImageIcon("icon/PayrollReports.png"));
	JButton btnTrainingReport = new JButton("  Training Reports        ", new ImageIcon("icon/TrainingReports.png"));
	JButton btnEmployeeTraining = new JButton(" Employee Training ", new ImageIcon("icon/EmployeeTraining.png"));
	JButton btnTrainingEvent = new JButton("  Training Event         ", new ImageIcon("icon/TrainingEvent.png"));
	JButton btnAnnouncementDetails = new JButton("Announcement Details", new ImageIcon("icon/AnnouncementDetails.png"));
	JButton btnAnnouncementMail = new JButton("Announcement Mail      ", new ImageIcon("icon/AnnouncementMail.png"));
	JButton btnAddUser = new JButton("   Add New User     ",new ImageIcon("icon/AddUser.png"));
	JButton btnChangePassword = new JButton("Change Password ", new ImageIcon("icon/ChangePassword.png"));
	JButton btnLogOff = new JButton("  User Log Out         ",new ImageIcon("icon/LogOff.png"));
	JButton btnExit = new JButton("    System Exit         ",new ImageIcon("icon/Exit.png"));
	JButton btnAbout = new JButton("   About                      ", new ImageIcon("icon/About.png"));
	JLabel bgEmployee = new JLabel(new ImageIcon("icon/EmployeeBg1.png"));
	JLabel bgAttendance = new JLabel(new ImageIcon("icon/AttendanceBg1.png"));
	JLabel bgPayroll = new JLabel(new ImageIcon("icon/PayrollBg1.png"));
	JLabel bgLeave = new JLabel(new ImageIcon("icon/LeaveBg1.png"));
	JLabel bgRecruitment = new JLabel(new ImageIcon("icon/RecruitementBg1.png"));
	JLabel bgLoan = new JLabel(new ImageIcon("icon/LoanBg1.png"));
	JLabel bgReport = new JLabel(new ImageIcon("icon/ReportBg1.png"));
	JLabel bgTraining = new JLabel(new ImageIcon("icon/TrainingBg1.png"));
	JLabel bgAnnouncement = new JLabel(new ImageIcon("icon/AnnouncementBg1.png"));
	JLabel bgOthers = new JLabel(new ImageIcon("icon/OthersBg1.png"));

	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

	public WorkingPanel(JFrame frame)
	{
		cmp();
		btnAction();
		this.frame = frame;
	}
	private void btnAction() 
	{
		btnBackward.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterWestCenterVisibleFalse();
				panelCenterWestNorthVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				panelCenterCenterVisibleTrue();
				lblHome.setVisible(true);
			}
		});
		btnEmployee.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgEmployee.setVisible(true);
				panelEmployee.setVisible(true);
				lblHome.setVisible(false);
				lblEmployeeHome.setVisible(true);
			}
		});
		btnAttendance.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgAttendance.setVisible(true);
				panelAttendance.setVisible(true);
				lblHome.setVisible(false);
				lblAttendanceHome.setVisible(true);
			}
		});
		btnPayroll.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgPayroll.setVisible(true);
				panelPayroll.setVisible(true);
				lblHome.setVisible(false);
				lblPayrollHome.setVisible(true);
			}
		});
		btnLeaves.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgLeave.setVisible(true);
				panelLeaves.setVisible(true);
				lblHome.setVisible(false);
				lblLeaveHome.setVisible(true);
			}
		});
		btnRecruitment.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgRecruitment.setVisible(true);
				panelRecruitements.setVisible(true);
				lblHome.setVisible(false);
				lblRecruitmentHome.setVisible(true);
			}
		});
		btnLoan.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgLoan.setVisible(true);
				panelLoan.setVisible(true);
				lblHome.setVisible(false);
				lblLoanHome.setVisible(true);
			}
		});
		btnReports.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgReport.setVisible(true);
				panelReports.setVisible(true);
				lblHome.setVisible(false);
				lblReportHome.setVisible(true);
			}
		});
		btnTrainings.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgTraining.setVisible(true);
				panelTrainings.setVisible(true);
				lblHome.setVisible(false);
				lblTrainingHome.setVisible(true);
			}
		});
		btnAnnouncements.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgAnnouncement.setVisible(true);
				panelAnnouncements.setVisible(true);
				lblHome.setVisible(false);
				lblAnnouncementHome.setVisible(true);
			}
		});
		btnOthers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				bgOthers.setVisible(true);
				panelOthers.setVisible(true);
				lblHome.setVisible(false);
				lblOthersHome.setVisible(true);
			}
		});

		//<------------------  Sub Button Action   -------------------->

		btnAddEmployee.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				addEmployee.setVisible(true);
			}
		});
		btnPersonalDetails.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				personalDetails.setVisible(true);
			}
		});
		btnJobDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				jobDetails.setVisible(true);
			}
		});
		btnSalaryDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				salaryDetails.setVisible(true);
			}
		});
		btnMonthlyReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				monthlyAttendance.setVisible(true);
			}
		});
		btnDailyReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				dailyAttendance.setVisible(true);
			}
		});
		btnSalaryStructure.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				salaryStructure.setVisible(true);
			}
		});
		btnAttendanceDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				attendanceDetails.setVisible(true);
			}
		});
		btnLeaveDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				leaveDetails.setVisible(true);
			}
		});
		btnEmployeeLeaves.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				employeeLeaves.setVisible(true);
			}
		});
		btnLeaveApplication.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				leaveApplication.setVisible(true);
			}
		});
		btnRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				register.setVisible(true);
			}
		});
		btnRecruitmentDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				recruitmentDetails.setVisible(true);
			}
		});
		btnEmployeeLoan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				employeeLoan.setVisible(true);
			}
		});
		btnLoanApplication.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				loanApplication.setVisible(true);
			}
		});
		btnHrReports.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				hrReprots.setVisible(true);
			}
		});
		btnRecruitmentReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				recruitmentReports.setVisible(true);
			}
		});
		btnEmployeeReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				employeeReports.setVisible(true);
			}
		});
		btnPayrollReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				payrollReports.setVisible(true);
			}
		});
		btnTrainingReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				trainingReports.setVisible(true);
			}
		});
		btnEmployeeTraining.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				employeeTraining.setVisible(true);
			}
		});
		btnTrainingEvent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				trainingEvent.setVisible(true);
			}
		});
		btnAnnouncementDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				announcementDetails.setVisible(true);
			}
		});
		btnAnnouncementMail.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				announcementMail.setVisible(true);
			}
		});
		btnAddUser.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				addUser.setVisible(true);
			}
		});
		btnChangePassword.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelCenterCenterVisibleFalse();
				panelBackgroundVisibleFalse();
				panelCenterCenterMirrorVisibleFalse();
				changePassword.setVisible(true);
			}
		});
		btnLogOff.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.setVisible(false);
				Login lg = new Login();
				ImageIcon hover = new ImageIcon("icon/hover.png");
				lg.setIconImage(hover.getImage());
			}
		});
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				exit.setVisible(true);
				int a = JOptionPane.showConfirmDialog(null, "Are you sure?\nyou want to exit now.","Confirm",JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.dispose();
				}
				else
				{
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
	}
	private void cmp()
	{
		setLayout(new BorderLayout());
		add(panelNorth, BorderLayout.NORTH);
		panelNorthWork();
		add(panelCenter, BorderLayout.CENTER);
		panelCenterWork();
	}
	private void panelNorthWork() 
	{
		panelNorth.setBackground(Color.decode("#91eaf7"));
		panelNorth.setPreferredSize(new Dimension(1, 125));
		panelNorth.setBorder(BorderFactory.createRaisedBevelBorder());
		panelNorth.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelNorth.add(lblTitle,c);
	}
	private void panelCenterWork() 
	{
		panelCenter.setLayout(new BorderLayout());
		panelCenter.add(panelCenterWest,BorderLayout.WEST);
		panelCenterWestWork();
		panelCenter.add(panelCenterCenter, BorderLayout.CENTER);
		panelCenterCenterWork();
		panelCenterCenter.add(panelCenterCenterMirror);
		panelCenterCenterMirrorWork();
	}
	private void panelCenterWestWork() 
	{
		panelCenterWest.setLayout(new BorderLayout());
		panelCenterWest.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		panelCenterWest.setPreferredSize(new Dimension(250, 1));
		panelCenterWest.add(panelCenterWestNorth,BorderLayout.NORTH);
		panelCenterWestNorthWork();
		panelCenterWest.add(panelcenterWestSouth, BorderLayout.SOUTH);
		panelcenterWestSouthWork();
		panelCenterWest.add(panelCenterWestCenter, BorderLayout.CENTER);
		panelCenterWestCenterWork();
	}
	private void panelCenterWestNorthWork() 
	{
		panelCenterWestNorth.setBackground(Color.decode("#00CED1"));
		panelCenterWestNorth.setPreferredSize(new Dimension(1, 150));
		panelCenterWestNorth.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 10, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblHome,c);
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblEmployeeHome,c);
		lblEmployeeHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblAttendanceHome,c);
		lblAttendanceHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblPayrollHome,c);
		lblPayrollHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblLeaveHome,c);
		lblLeaveHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblRecruitmentHome,c);
		lblRecruitmentHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblLoanHome,c);
		lblLoanHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblReportHome,c);
		lblReportHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblTrainingHome,c);
		lblTrainingHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblAnnouncementHome,c);
		lblAnnouncementHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		c.insets = new Insets(5, 5, 25, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterWestNorth.add(lblOthersHome,c);
		lblOthersHome.setFont(new Font("Georgia", Font.PLAIN+Font.BOLD, 20));
		panelCenterWestNorthVisibleFalse();
	}
	private void panelCenterWestNorthVisibleFalse()
	{
		lblEmployeeHome.setVisible(false);
		lblAttendanceHome.setVisible(false);
		lblPayrollHome.setVisible(false);
		lblLeaveHome.setVisible(false);
		lblRecruitmentHome.setVisible(false);
		lblLoanHome.setVisible(false);
		lblReportHome.setVisible(false);
		lblTrainingHome.setVisible(false);
		lblAnnouncementHome.setVisible(false);
		lblOthersHome.setVisible(false);
	}
	private void panelCenterWestCenterWork()
	{
		panelCenterWestCenter.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(0);
		panelCenterWestCenter.setLayout(flow);
		panelCenterWestCenter.add(panelEmployee);
		panelEmployeeWork();
		panelCenterWestCenter.add(panelAttendance);
		panelAttendanceWork();
		panelCenterWestCenter.add(panelPayroll);
		panelPayrollWork();
		panelCenterWestCenter.add(panelLeaves);
		panelLeavesWork();
		panelCenterWestCenter.add(panelRecruitements);
		panelRecruitementsWork();
		panelCenterWestCenter.add(panelLoan);
		panelLoanWork();
		panelCenterWestCenter.add(panelReports);
		panelReportsWork();
		panelCenterWestCenter.add(panelTrainings);
		panelTrainingsWork();
		panelCenterWestCenter.add(panelAnnouncements);
		panelAnnouncementsWork();
		panelCenterWestCenter.add(panelOthers);
		panelOthersWork();
		panelCenterWestCenterVisibleFalse();
	}
	private void panelEmployeeWork() 
	{
		panelEmployee.setPreferredSize(new Dimension(250, 415));
		panelEmployee.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setHgap(10);
		panelEmployee.setLayout(flow);
		panelEmployee.add(btnAddEmployee);
		btnAddEmployee.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelEmployee.add(btnPersonalDetails);
		btnPersonalDetails.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelEmployee.add(btnJobDetails);
		btnJobDetails.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelEmployee.add(btnSalaryDetails);
		btnSalaryDetails.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelAttendanceWork() 
	{
		panelAttendance.setPreferredSize(new Dimension(250, 415));
		panelAttendance.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setHgap(10);
		panelAttendance.setLayout(flow);
		panelAttendance.add(btnMonthlyReport);
		btnMonthlyReport.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelAttendance.add(btnDailyReport);
		btnDailyReport.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelPayrollWork() 
	{
		panelPayroll.setPreferredSize(new Dimension(250, 415));
		panelPayroll.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelPayroll.setLayout(flow);
		panelPayroll.add(btnSalaryStructure);
		btnSalaryStructure.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelPayroll.add(btnAttendanceDetails);
		btnAttendanceDetails.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelPayroll.add(btnLeaveDetails);
		btnLeaveDetails.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelLeavesWork() 
	{
		panelLeaves.setPreferredSize(new Dimension(250, 415));
		panelLeaves.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelLeaves.setLayout(flow);
		panelLeaves.add(btnEmployeeLeaves);
		btnEmployeeLeaves.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelLeaves.add(btnLeaveApplication);
		btnLeaveApplication.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelRecruitementsWork() 
	{
		panelRecruitements.setPreferredSize(new Dimension(250, 415));
		panelRecruitements.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelRecruitements.setLayout(flow);
		panelRecruitements.add(btnRegister);
		btnRegister.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 14));
		panelRecruitements.add(btnRecruitmentDetails);
		btnRecruitmentDetails.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelLoanWork() 
	{
		panelLoan.setPreferredSize(new Dimension(250, 415));
		panelLoan.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelLoan.setLayout(flow);
		panelLoan.add(btnEmployeeLoan);
		btnEmployeeLoan.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelLoan.add(btnLoanApplication);
		btnLoanApplication.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelReportsWork() 
	{
		panelReports.setPreferredSize(new Dimension(250, 415));
		panelReports.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelReports.setLayout(flow);
		panelReports.add(btnHrReports);
		btnHrReports.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelReports.add(btnRecruitmentReport);
		btnRecruitmentReport.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelReports.add(btnEmployeeReport);
		btnEmployeeReport.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelReports.add(btnPayrollReport);
		btnPayrollReport.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelReports.add(btnTrainingReport);
		btnTrainingReport.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelTrainingsWork() 
	{
		panelTrainings.setPreferredSize(new Dimension(250, 415));
		panelTrainings.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelTrainings.setLayout(flow);
		panelTrainings.add(btnEmployeeTraining);
		btnEmployeeTraining.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelTrainings.add(btnTrainingEvent);
		btnTrainingEvent.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelAnnouncementsWork() 
	{
		panelAnnouncements.setPreferredSize(new Dimension(250, 415));
		panelAnnouncements.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelAnnouncements.setLayout(flow);
		panelAnnouncements.add(btnAnnouncementDetails);
		btnAnnouncementDetails.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelAnnouncements.add(btnAnnouncementMail);
		btnAnnouncementMail.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelOthersWork() 
	{
		panelOthers.setPreferredSize(new Dimension(250, 415));
		panelOthers.setBackground(Color.decode("#00CED1"));
		FlowLayout flow = new FlowLayout();
		flow.setVgap(10);
		panelOthers.setLayout(flow);
		panelOthers.add(btnAddUser);
		btnAddUser.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelOthers.add(btnChangePassword);
		btnChangePassword.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelOthers.add(btnLogOff);
		btnLogOff.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelOthers.add(btnExit);
		btnExit.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
		panelOthers.add(btnAbout);
		btnAbout.setFont(new Font("Cambria", Font.PLAIN+Font.BOLD, 13));
	}
	private void panelCenterWestCenterVisibleFalse()
	{
		panelEmployee.setVisible(false);
		panelAttendance.setVisible(false);
		panelPayroll.setVisible(false);
		panelLeaves.setVisible(false);
		panelRecruitements.setVisible(false);
		panelLoan.setVisible(false);
		panelReports.setVisible(false);
		panelTrainings.setVisible(false);
		panelAnnouncements.setVisible(false);
		panelOthers.setVisible(false);
	}
	private void panelcenterWestSouthWork() 
	{
		panelcenterWestSouth.setBackground(Color.decode("#00CED1"));
		panelcenterWestSouth.setPreferredSize(new Dimension(1, 100));
		panelcenterWestSouth.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx=0;
		c.gridy=0;
		panelcenterWestSouth.add(btnBackward,c);
	}
	private void panelCenterCenterWork() 
	{
		panelCenterCenter.setBackground(Color.decode("#91eaf7"));
		panelCenterCenter.setBorder(BorderFactory.createLoweredBevelBorder());
		panelCenterCenter.add(panelCenterCenterMirror);
		panelCenterCenterMirrorWork();
		panelCenterCenter.add(panelBackground);
		panelBackgroundWork();
		panelCenterCenter.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 2, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelCenterCenter.add(btnEmployee, c);
		c.insets = new Insets(5, 5, 2, 5);
		c.gridx = 1;
		c.gridy = 0;
		panelCenterCenter.add(btnAttendance, c);
		c.insets = new Insets(5, 5, 2, 5);
		c.gridx = 2;
		c.gridy = 0;
		panelCenterCenter.add(btnPayroll, c);
		c.insets = new Insets(5, 5, 2, 5);
		c.gridx = 3;
		c.gridy = 0;
		panelCenterCenter.add(btnLeaves, c);
		c.insets = new Insets(5, 5, 2, 5);
		c.gridx = 4;
		c.gridy = 0;
		panelCenterCenter.add(btnRecruitment, c);
		c.insets = new Insets(2, 45, 5, 5);
		c.gridx = 0;
		c.gridy = 1;
		panelCenterCenter.add(lblEmployee, c);
		lblEmployee.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 35, 5, 5);
		c.gridx = 1;
		c.gridy = 1;
		panelCenterCenter.add(lblAttendence, c);
		lblAttendence.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 55, 5, 5);
		c.gridx = 2;
		c.gridy = 1;
		panelCenterCenter.add(lblPayroll, c);
		lblPayroll.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 55, 5, 5);
		c.gridx = 3;
		c.gridy = 1;
		panelCenterCenter.add(lblLeaves, c);
		lblLeaves.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 25, 5, 5);
		c.gridx = 4;
		c.gridy = 1;
		panelCenterCenter.add(lblRecruitment, c);
		lblRecruitment.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(20, 5, 2, 5);
		c.gridx = 0;
		c.gridy = 2;
		panelCenterCenter.add(btnLoan, c);
		c.insets = new Insets(20, 5, 2, 5);
		c.gridx = 1;
		c.gridy = 2;
		panelCenterCenter.add(btnReports, c);
		c.insets = new Insets(20, 5, 2, 5);
		c.gridx = 2;
		c.gridy = 2;
		panelCenterCenter.add(btnTrainings, c);
		c.insets = new Insets(20, 5, 2, 5);
		c.gridx = 3;
		c.gridy = 2;
		panelCenterCenter.add(btnAnnouncements, c);
		c.insets = new Insets(20, 5, 2, 5);
		c.gridx = 4;
		c.gridy = 2;
		panelCenterCenter.add(btnOthers, c);
		c.insets = new Insets(2, 60, 25, 5);
		c.gridx = 0;
		c.gridy = 3;
		panelCenterCenter.add(lblLoan, c);
		lblLoan.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 50, 25, 5);
		c.gridx = 1;
		c.gridy = 3;
		panelCenterCenter.add(lblReports, c);
		lblReports.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 45, 25, 5);
		c.gridx = 2;
		c.gridy = 3;
		panelCenterCenter.add(lblTrainings, c);
		lblTrainings.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 15, 25, 5);
		c.gridx = 3;
		c.gridy = 3;
		panelCenterCenter.add(lblAnnouncements, c);
		lblAnnouncements.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
		c.insets = new Insets(2, 55, 25, 5);
		c.gridx = 4;
		c.gridy = 3;
		panelCenterCenter.add(lblOthers, c);
		lblOthers.setFont(new Font("Papyrus", Font.PLAIN+Font.BOLD, 18));
	}
	private void panelCenterCenterVisibleFalse()
	{
		btnEmployee.setVisible(false);
		lblEmployee.setVisible(false);
		btnAttendance.setVisible(false);
		lblAttendence.setVisible(false);
		btnPayroll.setVisible(false);
		lblPayroll.setVisible(false);
		btnLeaves.setVisible(false);
		lblLeaves.setVisible(false);
		btnRecruitment.setVisible(false);
		lblRecruitment.setVisible(false);
		btnLoan.setVisible(false);
		lblLoan.setVisible(false);
		btnReports.setVisible(false);
		lblReports.setVisible(false);
		btnTrainings.setVisible(false);
		lblTrainings.setVisible(false);
		btnAnnouncements.setVisible(false);
		lblAnnouncements.setVisible(false);
		btnOthers.setVisible(false);
		lblOthers.setVisible(false);
	}
	private void panelCenterCenterVisibleTrue()
	{
		btnEmployee.setVisible(true);
		lblEmployee.setVisible(true);
		btnAttendance.setVisible(true);
		lblAttendence.setVisible(true);
		btnPayroll.setVisible(true);
		lblPayroll.setVisible(true);
		btnLeaves.setVisible(true);
		lblLeaves.setVisible(true);
		btnRecruitment.setVisible(true);
		lblRecruitment.setVisible(true);
		btnLoan.setVisible(true);
		lblLoan.setVisible(true);
		btnReports.setVisible(true);
		lblReports.setVisible(true);
		btnTrainings.setVisible(true);
		lblTrainings.setVisible(true);
		btnAnnouncements.setVisible(true);
		lblAnnouncements.setVisible(true);
		btnOthers.setVisible(true);
		lblOthers.setVisible(true);
	}
	private void panelCenterCenterMirrorWork() 
	{
		GridBagConstraints c = new GridBagConstraints();
		panelCenterCenterMirror.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(0, 0, 0, 0);
		panelCenterCenter.add(addEmployee,c);
		panelCenterCenter.add(personalDetails,c);
		panelCenterCenter.add(jobDetails,c);
		panelCenterCenter.add(salaryDetails,c);
		panelCenterCenter.add(dailyAttendance,c);
		panelCenterCenter.add(monthlyAttendance,c);
		panelCenterCenter.add(attendanceDetails,c);
		panelCenterCenter.add(leaveDetails,c);
		panelCenterCenter.add(salaryStructure,c);
		panelCenterCenter.add(employeeLeaves,c);
		panelCenterCenter.add(leaveApplication,c);
		panelCenterCenter.add(register,c);
		panelCenterCenter.add(recruitmentDetails,c);
		panelCenterCenter.add(employeeLoan,c);
		panelCenterCenter.add(loanApplication,c);
		panelCenterCenter.add(hrReprots,c);
		panelCenterCenter.add(recruitmentReports,c);
		panelCenterCenter.add(employeeReports,c);
		panelCenterCenter.add(payrollReports,c);
		panelCenterCenter.add(trainingReports,c);
		panelCenterCenter.add(employeeTraining,c);
		panelCenterCenter.add(trainingEvent,c);
		panelCenterCenter.add(announcementDetails,c);
		panelCenterCenter.add(announcementMail,c);
		panelCenterCenter.add(addUser,c);
		panelCenterCenter.add(changePassword,c);
		panelCenterCenter.add(logOff,c);
		panelCenterCenter.add(exit, c);
		panelCenterCenterMirrorVisibleFalse();
	};
	private void panelCenterCenterMirrorVisibleFalse() 
	{
		addEmployee.setVisible(false);
		personalDetails.setVisible(false);
		jobDetails.setVisible(false);
		salaryDetails.setVisible(false);
		dailyAttendance.setVisible(false);
		monthlyAttendance.setVisible(false);
		attendanceDetails.setVisible(false);
		leaveDetails.setVisible(false);
		salaryStructure.setVisible(false);
		employeeLeaves.setVisible(false);
		leaveApplication.setVisible(false);
		register.setVisible(false);
		recruitmentDetails.setVisible(false);
		employeeLoan.setVisible(false);
		loanApplication.setVisible(false);
		hrReprots.setVisible(false);
		recruitmentReports.setVisible(false);
		employeeReports.setVisible(false);
		payrollReports.setVisible(false);
		trainingReports.setVisible(false);
		employeeTraining.setVisible(false);
		trainingEvent.setVisible(false);
		announcementDetails.setVisible(false);
		announcementMail.setVisible(false);
		addUser.setVisible(false);
		changePassword.setVisible(false);
		logOff.setVisible(false);
		exit.setVisible(false);
	}
	private void panelBackgroundWork() 
	{
		GridBagConstraints c = new GridBagConstraints();
		panelBackground.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(0, 0, 0, 0);
		panelCenterCenter.add(bgEmployee);
		panelCenterCenter.add(bgAttendance);
		panelCenterCenter.add(bgPayroll);
		panelCenterCenter.add(bgLeave);
		panelCenterCenter.add(bgRecruitment);
		panelCenterCenter.add(bgLoan);
		panelCenterCenter.add(bgReport);
		panelCenterCenter.add(bgTraining);
		panelCenterCenter.add(bgAnnouncement);
		panelCenterCenter.add(bgOthers);
		panelBackgroundVisibleFalse();
	}
	private void panelBackgroundVisibleFalse() 
	{
		bgEmployee.setVisible(false);
		bgAttendance.setVisible(false);
		bgPayroll.setVisible(false);
		bgLeave.setVisible(false);
		bgRecruitment.setVisible(false);
		bgLoan.setVisible(false);
		bgReport.setVisible(false);
		bgTraining.setVisible(false);
		bgAnnouncement.setVisible(false);
		bgOthers.setVisible(false);
	}
}