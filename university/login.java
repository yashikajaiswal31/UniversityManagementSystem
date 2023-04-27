package university;
import javax.swing.*;
import java.awt.*; //colour class
import java.awt.event.*; //for action listneer subpacakge
import java.sql.*;

public class login extends JFrame  implements ActionListener{
	JButton login ,cancel;
	JTextField euser ,passw;
  
	//declared globally to use in acttion listener
	login()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);  //to not use swing default layout ans set on own 
		JLabel username = new JLabel("USER-NAME");
		username.setBounds(40 ,20,100 ,20);  //to explcitly place content
		add(username);
		//to create input field use jtext field 
		 euser = new JTextField();
		euser.setBounds(150, 20, 150, 20);
		add(euser);
		JLabel pass = new JLabel("PASSWORD");
		pass.setBounds(40 ,70,100 ,20);  //to explcitly place content
		add(pass);
		//to create input field use jtext field 
	 passw = new JPasswordField(); // password field to hide the password
		passw.setBounds(150, 70, 150, 20);
		add(passw);
		 login = new JButton("Login");
		//to create button
		login.setBounds(40, 140, 120, 30);
		login.setBackground(Color.RED);
		login.setForeground(Color.BLACK);
		login.addActionListener(this);   //TO ADD A EVENT TO OCCUR ON CLICK , this is current class reference 
		login.setFont(new Font("serif",Font.BOLD,15));//can pass three argument- family ,type size
		
		
		
		add(login);
		//next button
		 cancel = new JButton("Cancel");
		//to create button
		cancel.setBounds(180, 140, 120, 30);
		cancel.setBackground(Color.RED);
		cancel.setForeground(Color.BLACK);
		cancel.addActionListener(this);
		cancel.setFont(new Font("serif",Font.BOLD,15));//can pass three argument- family ,type size
		add(cancel);
   //add action listner to close the frame when clicked on cancel 
		ImageIcon il =  new ImageIcon(ClassLoader.getSystemResource("icon/Symbiosis-Logo.png"));
		Image i2 = il.getImage().getScaledInstance(180,200 ,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image= new JLabel(i3);
	     image.setBounds(350 ,10 ,200,200);
		add(image);
		
		setSize(600 ,300);
		setLocation(500 ,250);
		setVisible(true);
		//to insert a image in frame or to write
		//in frame use jlabel class 
		
		
	}
	// the add action listener interally calls this function 
  public static void main(String ag[])
  {
	  new login();
  }
@Override
public void actionPerformed(ActionEvent e) {
	// action event tracks the source from where button is called login or cancel
	if(e.getSource()==login)
	{String username = euser.getText();
	String password = passw.getText();
	String query ="select * from login where username='"+username+"' and password='"+password+"'";
	//this is mysql query ,we put '' because varchar accepts single '' commas only
	//now execute the query
try {
	Conn c = new Conn();
	
ResultSet rs = c.s.executeQuery(query);
if(rs.next())
{
	setVisible(false);
	new project();
}else
{
   JOptionPane.showMessageDialog(null, "Invalid Username or Password");
  setVisible(false);
}
c.s.close();
}catch(Exception we) {
	we.printStackTrace();
}
		
	}else if(e.getSource()==cancel)
	{
		setVisible(false); //to hide the login screen
     
	}
	
}
}