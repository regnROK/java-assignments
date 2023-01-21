import javax.swing.*;
import javax.awt.event.*;
import java.io.*;
public class mobile
{
	public static void main()
	{
	JFrame frame = new JFrame();
	JTextField id = new JTextField();
	JTextField model = new JTextField();
	JTextField brand = new JTextField();
	JTextField price = new JTextField();
	JLabel id = new JLabel("i`d = ");
	JButton enter = new JButton("Submit");
	JLabel model = new JLabel("model = ");
	JLabel brand = new JLabel("brand = ");
	JLabel price = new JLabel("price = ");
	id.setBounds(10,10,200,30);
	enter.setBounds(90, 200, 120, 50);
	model.setBounds(10,80,200,30);
	brand.setBounds(10,120,200,30);
	price.setBounds(10,160,200,30);
    frame.add(id);
    frame.add(submit);
    frame.add(Model);
    frame.add(Brand);;
    frame.add(Price);
    frame.setSize(1000,1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    String n = id.getText();
                    String modl = model.getText();
                    String brnd = brand.getText();
                    String pris = price.getText();
                    int n = Integer.parseInt(b);
                    String filepath = brnd;
                    filepath+=".txt";
                    PrintWriter pw = new PrintWriter(filepath);
                    pw.println("i`d :"+n);
                    pw.println("Model:"+modl);
                    pw.println("Brand:"+brnd);
                    pw.println("Price:"+pris);
                    pw.flush();
                    pw.close();
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(frame, "Please enter a i`d from 1-4!", null, 0);
                    id.setText(null);
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(frame, "File Not Found", null, 0);
                }
               
            }
		});
	}
}
