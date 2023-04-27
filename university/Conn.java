package university;
import java.sql.*;
public class Conn {

	//to connect to mysql we follow 5 steps
	//register the driver class
	//creating connection string 
	//create the statment
	//executing mysql queries
	//closing the connection
	Connection c ; //to establish connection (connection interface)
	Statement s; //to create statment (statement interface)
	Conn()
	{
		try {
		//register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//name of package ,driver is class in which mysql package is stored	
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root" ,"akshra29");
		//to pass the info what to store in sql driver manger class get connection method
		//3306 default port of mysql
		s = c.createStatement();  //statement help execute mysql queries 
		}catch(Exception e) {
		
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
