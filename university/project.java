package university;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class project  extends JFrame implements ActionListener{
	project()
	{
		setSize(1540 ,850);
		
		ImageIcon il =  new ImageIcon(ClassLoader.getSystemResource("icon/remote.jpg"));
		Image i2 = il.getImage().getScaledInstance(1000,700 ,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image= new JLabel(i3);
		add(image);
		//to create menubar we use jmenu bar class
		JMenuBar bar = new JMenuBar();
		JMenu newInformation= new JMenu("New Entry Information");
		newInformation.setForeground(Color.BLACK);
		
		bar.add(newInformation);
		//to create a list to add menu items in it 
		JMenuItem faculty = new JMenuItem("New Faculty Information");
		faculty.addActionListener(this);
		newInformation.add(faculty);
		//tp show in which menu add list
		JMenuItem student = new JMenuItem("New Student Information");
		student.addActionListener(this);
		newInformation.add(student);
		//new info(details of student professor)
		JMenu detail= new JMenu("View Details");
	detail.setForeground(Color.RED);
		
		bar.add(detail);
		//to create a list to add menu items in it 
		JMenuItem facultyd = new JMenuItem("Faculty Detail");
	facultyd.addActionListener(this);
		detail.add(facultyd);
		//tp show in which menu add list
		JMenuItem studentd = new JMenuItem("Student Detail");
		studentd.addActionListener(this);
		detail.add(studentd);
		//new info (leave)
		
		JMenu leave= new JMenu("Apply For Leave");
		leave.setForeground(Color.BLACK);
			
			bar.add(leave);
			//to create a list to add menu items in it 
			
			JMenuItem facultyl = new JMenuItem("Faculty Leave");
			facultyl.addActionListener(this);
			leave.add(facultyl);
			//tp show in which menu add list
			JMenuItem studentl = new JMenuItem("Student Leave");
			studentl.addActionListener(this);
			leave.add(studentl);
			
			//
			//leave details 
			
			JMenu leaved= new JMenu("Leave Details");
			leaved.setForeground(Color.RED);
				
				bar.add(leaved);
				//to create a list to add menu items in it 
				
				JMenuItem facultyld = new JMenuItem("Faculty Leave Details");
			facultyld.addActionListener(this);
				
				leaved.add(facultyld);
				//tp show in which menu add list
				JMenuItem studentld = new JMenuItem("Student Leave Details");
				studentld.addActionListener(this);
				leaved.add(studentld);
				//exam 
				JMenu exam= new JMenu("Exam Details");
				exam.setForeground(Color.BLACK);
					
					bar.add(exam);
					//to create a list to add menu items in it 
					JMenuItem examd = new JMenuItem("View Results");
					 examd.addActionListener(this);
				        
				exam.add(examd);
					//tp show in which menu add list
					JMenuItem  enterm = new JMenuItem("Enter Marks");
					  enterm.addActionListener(this);
					exam.add(enterm);
					//update the info 
					
					JMenu update= new JMenu("Update Details");
					update.setForeground(Color.RED);
						
						bar.add(update);
						//to create a list to add menu items in it 
						JMenuItem updatef = new JMenuItem("Update Faculty Information");
						 updatef.addActionListener(this);
						update.add(updatef);
						//to show in which menu add list
						JMenuItem  updates = new JMenuItem("Update Student Information");
						 updates.addActionListener(this);
						update.add(updates);
						//fee details 
				
						JMenu fee= new JMenu("Fee Details");
						fee.setForeground(Color.BLACK);
							
							bar.add(fee);
							//to create a list to add menu items in it 
							JMenuItem feestruct = new JMenuItem("Fee Structure");
							  feestruct.addActionListener(this);
							fee.add(feestruct);
							//to show in which menu add list
							JMenuItem  feeform = new JMenuItem("Pay Your Fee");
							 feeform.addActionListener(this);
							fee.add(feeform);
							
							//exit project
							JMenu exit= new JMenu("Exit");
							exit.setForeground(Color.RED);
								
								bar.add(exit);
								//to create a list to add menu items in it 
								
								JMenuItem ex = new JMenuItem("Exit");
							ex.addActionListener(this); 
								exit.add(ex);
							//	
		   
								
									//to create a list to add menu items in it 
									
								//
							
		setJMenuBar(bar);//cant use add for menu bar 
		setVisible(true); //should be last statement of constructor
	}

	public static void main(String[] args) {
		new project();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
		//to check the condition by matching the content of string 
		String m= e.getActionCommand();
		if(m.equals("Exit"))
		{
			setVisible(false);
		}else if(m.equals("New Faculty Information"))
				{
			       new addfaculty();
				}else if(m.equals("New Student Information"))
				{
					new addstudent();
				}
				
				else if(m.equals("Student Detail"))
				{
					new studentdetails();
					
				}else if(m.equals("Faculty Detail"))
				{
					new facultydetail();
				}else if(m.equals("Faculty Leave"))
				{
					new facultyleave();
				}else if(m.equals("Student Leave"))
				{
					new studentleave();
				}else if(m.equals("Faculty Leave Details"))
				{
					   new facultyleavedetail();
				}else if(m.equals("Student Leave Details"))
				{
	                 new StudentLeaveD();
				}else if(m.equals("View Results"))
				{
	                 new ExaminationDetails();
				}else if(m.equals("Enter Marks"))
				{
	                 new entermarks();
				}else if(m.equals("Update Faculty Information"))
				{
	                 new updatefaculty();
				}else if(m.equals("Update Student Information"))
				{
	                 new updatestudent();
				}else if(m.equals("Fee Structure"))
				{
	                 new feestructure();
				}else if(m.equals("Pay Your Fee"))
				{
	                 new studentfeeform();
				}
		
				
	}
	

}
