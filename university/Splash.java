package university;
import java.awt.Image;

import javax.swing.*; //java extended package 

public class Splash extends JFrame implements Runnable{ //cannot extend two classes so we implement runabble for multithreading 
	//runabble for multithreading 
	Thread t;
	Splash()
	{
		ImageIcon il =  new ImageIcon(ClassLoader.getSystemResource("icon/SIT.png"));
		Image i2 = il.getImage().getScaledInstance(1000,700 ,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image= new JLabel(i3);
	     
		add(image);
		t= new Thread(this);
		t.start(); //class run method internally 
		setVisible(true);
		int x=1;
		for(int i=2 ;i<=600 ;i+=4,x+=1)
		{
		setLocation(600-((i+x)/2) ,350 -(i/2));	//by default its top -left - (left top )
		setSize(i + 3*x,i+x/2); //to set size of frame -length ,breadth
		
		try{
			Thread.sleep(10);
			//false by default
		}catch(Exception e) {}
	}
	}
	//run method was abstract method inside runabble interface 
	public void run()
	{
		 try {
			 
			 Thread.sleep(6500); //takes value in miliseconds 
			 setVisible(false); 
			 //frame closes after 77 seconds 
			 //next frame opens now 
			 new login(); //calss login class constructor 
		 }catch (Exception e)
		 {
			 
		 }
	}
	public static void main(String ag[])
	{
		 new Splash();
		
		
	}

}
