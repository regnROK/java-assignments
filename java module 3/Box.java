import javax.swing.*;
public class Box
{
	Box(){
		JFrame f=new jFrame("Checkbox example");
		JCheckBox checkbox1 = new JCheckBox("c++",true);
		checkbox1.setBounds(100,100,50,50);
		JCheckBox checkbox2 = new JCheckBox("Java",false);
		checkbox2.setBounds(100,200,100,50);
		f.add(checkbox1);
            f.add(checkbox2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String args[])
{
new Box();
}}

	 