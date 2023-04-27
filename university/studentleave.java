package university;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;


public class studentleave extends JFrame implements ActionListener{

	Choice croll ,ctime;
	JDateChooser dobb;
	JButton submit ,cancel;
	 studentleave()
	{
		 setSize(500,500);
		 setLocation(550,100);
		 setLayout(null);
		 
		 getContentPane().setBackground(Color.WHITE);
			JLabel heading = new JLabel("Apply Leave(Student)");
			heading.setBounds(40,50,300,30);
		
			add(heading);
		
			JLabel lblrollno = new JLabel("Search by Roll No");
			lblrollno.setBounds(60,100,150,20);
			add(lblrollno);
			croll = new Choice();
			croll.setBounds(60 ,130 ,200 ,20);
			add(croll);
			
			try
			{
				Conn c= new Conn();
				ResultSet rs = c.s.executeQuery("select * from student");
				while(rs.next())
				{
					croll.add(rs.getString("rollno"));
				}
			}catch(Exception e)
			{
			   e.printStackTrace();
			}
			
		 

			JLabel lbldate = new JLabel("Date");
			lbldate.setBounds(60,180,150,20);
			add(lbldate);
			 dobb=  new JDateChooser();
			    dobb.setBounds(60 ,210 ,200,30);
			    add(dobb);
			    

				JLabel time = new JLabel("Time");
				time.setBounds(60,260,200,20);
				add(time);
				ctime = new Choice();
				ctime.setBounds(60 ,290 ,200 ,20);
				ctime.add("Full Day");
				ctime.add("Half Day");
				add(ctime);
				  
		        submit = new JButton("Submit");
		        submit.setBounds(60, 350, 100, 30);
		        submit.setBackground(Color.BLACK);
		        submit.setForeground(Color.WHITE);
		        submit.addActionListener(this);
		        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
		        add(submit);
		        
		        cancel = new JButton("Cancel");
		        cancel.setBounds(200, 350, 100, 30);
		        cancel.setBackground(Color.BLACK);
		        cancel.setForeground(Color.WHITE);
		        cancel.addActionListener(this);
		        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		        add(cancel);
		 setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new studentleave();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==submit)
		{
			
			String rollno = croll.getSelectedItem();
			
			String date=((JTextField)dobb.getDateEditor().getUiComponent()).getText();
		    String duration =ctime.getSelectedItem();
		    String query = "insert into studentleave values('"+rollno+"', '"+date+"', '"+duration+"')";
	
		    try {
		    	if(dobb.getDate()==null) {
		    		JOptionPane.showMessageDialog(null, "Please specify the Date!!");
	                setVisible(true);
		    	}
		    	else {
		    		Conn c = new Conn();
	                c.s.executeUpdate(query);
	                JOptionPane.showMessageDialog(null, "Leave Confirmed");
	                setVisible(false);
		    	}
                
            } catch (Exception te) {
                te.printStackTrace();
            }
		}else 
		{
			setVisible(false);
		}
	}

}
