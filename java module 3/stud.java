import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Stud{
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	public Stud(){
	initGui();
	}

	public void initGui(){
	Scanner sc = new Scanner(System.in);
	JFrame f = new JFrame("Student Info");
	
	l1 = new JLabel("Roll no.");
	l2 = new JLabel("Name");
	l3 = new JLabel("Branch");
	
	tf1 = new JTextField(20);
	tf2 = new JTextField(20);
	tf3 = new JTextField(20);
	System.out.println("Enter roll no. : ");
	String roll = sc.next();
	System.out.println("Enter name : ");
	String name = sc.next();
	System.out.println("Enter branch : ");
	String branch = sc.next();
	
	tf1.setText(roll);
	tf2.setText(name);
	tf3.setText(branch);

	Container c = f.getContentPane();
	c.setLayout(new FlowLayout());

	c.add(l1);
	c.add(tf1);
	c.add(l2);
	c.add(tf2);
	c.add(l3);
	c.add(tf3); 
	
	f.setSize(300,300);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]){
	Stud s1 = new Stud();
	}
}