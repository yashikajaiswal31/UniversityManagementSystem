package university;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import net.proteanit.sql.DbUtils;//directly  insertvalues of sql into table 


public class facultydetail extends JFrame implements ActionListener {

	
	Choice croll; 
	
	//to create drop down ,earlier we used jcombo ,we casn also use this 
	JTable table;
	JButton  search ,print,update ,cancel,add;
	facultydetail()
	{
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Search by Emp-ID No");
		heading.setBounds(20,20,150,20);
		add(heading);
		croll = new Choice();
		croll.setBounds(180 ,20 ,150 ,20);
		add(croll);
		
		try
		{
			Conn c= new Conn();
			ResultSet rs = c.s.executeQuery("select * from teacher");
			while(rs.next())
			{
				croll.add(rs.getString("empID"));
			}
		}catch(Exception e)
		{
		   e.printStackTrace();
		}
		table= new JTable();//new table 
		
		try
		{
			Conn c= new Conn();
			ResultSet rs = c.s.executeQuery("select * from teacher");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			//to get all the data in table (from sql)
		}catch(Exception e)
		{
		   e.printStackTrace();
		}
		JScrollPane jsp = new JScrollPane(table);//to put scrooll bar over table
		jsp.setBounds(0,100,900,600);
		add(jsp);
		search= new JButton("Search");
		search.setBounds(20,70,80,20);
		search.addActionListener(this);
		add(search);
		//
		print= new JButton("Print");
		print.setBounds(120,70,80,20);
		print.addActionListener(this);
		add(print);
		//
		add= new JButton("Add");
		add.setBounds(220,70,80,20);
		add.addActionListener(this);
		add(add);
		//
		update= new JButton("Update");
		update.setBounds(320,70,80,20);
		update.addActionListener(this);
		add(update);
		//
		cancel= new JButton("Cancel");
		cancel.setBounds(420,70,80,20);
		cancel.addActionListener(this);
		add(cancel);
		//
		setSize(900,700);
		setLocation(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		
             new facultydetail();  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==search)
		{
			
			String query = "select * from teacher where empID =  '" +croll.getSelectedItem()+"'";
		
			try 
			{
				Conn c = new Conn();
				ResultSet rs= c.s.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}catch(Exception t)
			{
				t.printStackTrace();
			}
		}else if(e.getSource()==print)
		{
			try  //since print is a external command
			{
				table.print();
				
			}catch(Exception de)
			{
				de.printStackTrace();
			}
			
			
			
		}else if(e.getSource()==add)
		{
			
			setVisible(false);
			new addfaculty();
		}else if(e.getSource()==update)
		{
			setVisible(false);
			//new updatefaculty();
		}
		else if(e.getSource()==cancel)
		{
			setVisible(false);
		}
		}
	}


