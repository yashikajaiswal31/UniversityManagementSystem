package university;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class addstudent extends JFrame  implements ActionListener{

	JTextField  uname ,ufname,uadd,uphone,umail,um10,um12 ,uadn ;
	JLabel uroll; //cant change label values
	JDateChooser dobb;//to have calender to choose dob
	Random ran = new Random();
	JComboBox cbcourse;
	JButton submit ,cancel;
	
	//to generate random roll no
	long four = Math.abs((ran.nextLong() % 9000L) + 1000L);
	addstudent()
	{
		
		getContentPane().setBackground(Color.pink);
		setSize(900,700);
		setLocation(350 ,50);
		setLayout(null);
		JLabel heading = new JLabel("New Student Details");
		heading.setBounds(310, 30, 500, 30);
		heading.setFont(new Font("serif" ,Font.BOLD,30));
		add(heading);
		//add name -
		JLabel name = new JLabel("Name");
		name.setBounds(50, 150, 100, 30);
		name.setFont(new Font("serif" ,Font.BOLD, 20));
		add(name);
		
		uname = new JTextField();
		uname.setBounds(200,150 ,150 ,30);
		add(uname);
		
		//add fathersname
		JLabel fname = new JLabel("Father's Name");
		fname.setBounds(400, 150, 200, 30);
		fname.setFont(new Font("serif" ,Font.BOLD, 20));
		add(fname);
		
		ufname = new JTextField();
		ufname.setBounds(600,150 ,150 ,30);
		add(ufname);
		//roll no 
		JLabel roll = new JLabel("Roll No");
		roll.setBounds(50, 200, 200, 30);
		roll.setFont(new Font("serif" ,Font.BOLD, 20));
		add(roll);
		
		 uroll = new JLabel("2107012" + four);
		uroll.setBounds(200, 200, 200, 30);
		uroll.setFont(new Font("serif" ,Font.BOLD, 20));
		add(uroll);
		//birthday 
		JLabel dob = new JLabel("Date Of Birth");
		dob.setBounds(400, 200, 200, 30);
		dob.setFont(new Font("serif" ,Font.BOLD, 20));
		add(dob);
		
	    dobb=  new JDateChooser();
	    dobb.setBounds(600 ,200 ,150,30);
	    add(dobb);
		//address
	    JLabel address = new JLabel("Address");
		address.setBounds(50, 250, 200, 30);
		address.setFont(new Font("serif" ,Font.BOLD, 20));
		add(address);
		
		uadd = new JTextField();
		uadd.setBounds(200,250 ,150 ,30);
		add(uadd);
		// phone no
		  JLabel phone = new JLabel("Phone No");
			phone.setBounds(400, 250, 200, 30);
			phone.setFont(new Font("serif" ,Font.BOLD, 20));
			add(phone);
			
			uphone = new JTextField();
			uphone.setBounds(600,250 ,150 ,30);
			add(uphone);
		//email
			 JLabel email = new JLabel("Email ID");
				email.setBounds(50, 300, 200, 30);
				email.setFont(new Font("serif" ,Font.BOLD, 20));
				add(email);
				
				umail = new JTextField();
				umail.setBounds(200,300 ,150 ,30);
				add(umail);
				// 10th marks
				  JLabel m10 = new JLabel("10TH Marks (%)");
					m10.setBounds(400, 300, 200, 30);
					m10.setFont(new Font("serif" ,Font.BOLD, 20));
					add(m10);
					
					um10 = new JTextField();
					um10.setBounds(600,300 ,150 ,30);
					add(um10);
				//12th marks
					  JLabel m12 = new JLabel("12TH Marks (%)");
						m12.setBounds(50, 350, 200, 30);
						m12.setFont(new Font("serif" ,Font.BOLD, 20));
						add(m12);
						
						um12 = new JTextField();
						um12.setBounds(200,350 ,150 ,30);
						add(um12);
					//aadhar no
						  JLabel adn = new JLabel("Aadhar No");
							adn.setBounds(400, 350, 150, 30);
							adn.setFont(new Font("serif" ,Font.BOLD, 20));
							add(adn);
							
							uadn = new JTextField();
							uadn.setBounds(600,350 ,150 ,30);
							add(uadn);
						//course choose 
							  JLabel course = new JLabel("Course");
								course.setBounds(50, 400, 200, 30);
								course.setFont(new Font("serif" ,Font.BOLD, 20));
								add(course);
								String ccourse[]= {"Electronics Engineering","Mechnaical Engineering","Computer Science Engineering","Civil Engineering","Robotics Engineering",
									"Chemical Engineering"};
								//now we need to create drop down
							cbcourse=new JComboBox(ccourse);
								cbcourse.setBackground(Color.WHITE );
								
							
							cbcourse.setBounds(200,400,150,30);
								add(cbcourse);
								 submit = new JButton("Sumbit");
									//to create button
									submit.setBounds(250, 550, 120, 30);
									submit.setBackground(Color.RED);
									submit.setForeground(Color.BLACK);
									submit.addActionListener(this);   //TO ADD A EVENT TO OCCUR ON CLICK , this is current class reference 
									submit.setFont(new Font("serif",Font.BOLD,15));//can pass three argument- family ,type size
									add(submit);
									 cancel= new JButton("Cancel");
										//to create button
										cancel.setBounds(450, 550, 120, 30);
										cancel.setBackground(Color.RED);
										cancel.setForeground(Color.BLACK);
										cancel.addActionListener(this);   //TO ADD A EVENT TO OCCUR ON CLICK , this is current class reference 
										cancel.setFont(new Font("serif",Font.BOLD,15));//can pass three argument- family ,type size
										add(cancel);
									
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new addstudent();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== submit)
		{
			// uname ,ufname,uadd,uphone,umail,um10,um12 ,uadn 
			String name = uname.getText();
			String father= ufname.getText();
			String rolln= uroll.getText();
			String dobbb= ((JTextField)dobb.getDateEditor().getUiComponent()).getText();
			String add= uadd.getText();
			String phone= uphone.getText();
			String mail= umail.getText();
			String m10t= um10.getText();
			String um12w= um12.getText();
			String uad= uadn.getText();
			String course =(String)cbcourse.getSelectedItem();
			
			try {
				
            	
				
				String phoneNum = uphone.getText();
				String adhar=uadn.getText();
				String tenth=um10.getText();
				String twelth=um12.getText();
				long a=Long.parseLong(adhar);
				 long num = Long.parseLong(phoneNum);
				if(uname.getText().isEmpty() || ufname.getText().isEmpty() || uadd.getText().isEmpty() || uphone.getText().isEmpty() || umail.getText().isEmpty() || um10.getText().isEmpty() ||dobb.getDate() == null || um12.getText().isEmpty() || uadn.getText().isEmpty()) {
					
					
					JOptionPane.showMessageDialog(null, "Please fill all the details!!");
					setVisible(true);
				}
				else if(phoneNum.length() != 10 || !(phoneNum.matches("\\d+"))) {
					JOptionPane.showMessageDialog(null, "Enter a valid 10 digit Phone number");
					setVisible(true);
				}
				
				else if(adhar.length()!=12 || !(adhar.matches("\\d+"))) {
					JOptionPane.showMessageDialog(null, "Enter a valid 12 digit Adhar number");
					setVisible(true);
				
				}
				else if (!(tenth.matches("\\d+"))|| !(Integer.parseInt(tenth) <= 100)) {
				    // code to be executed if tenth is a number less than or equal to 100
					JOptionPane.showMessageDialog(null, "Enter valid marks!!");
					setVisible(true);
				}
				else if (!(twelth.matches("\\d+"))|| !(Integer.parseInt(twelth) <= 100)) {
				    // code to be executed if tenth is a number less than or equal to 100
					JOptionPane.showMessageDialog(null, "Enter valid marks!!");
					setVisible(true);
				}
				else {
					String query = "insert into student values('"+name+"', '"+father+"', '"+rolln+"', '"+dobbb+"', '"+add+"', '"+phone+"', '"+mail+"', '"+m10t+"', '"+um12w+"', '"+uad+"', '"+course+"')";

	                Conn con = new Conn();
	                con.s.executeUpdate(query);
	                
	                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
	                setVisible(false);
				}   
	                
			}catch(Exception te)
			{
				te.printStackTrace();
			}
			
			
			
			
		}else {
			setVisible(false);
		}
	}

}
