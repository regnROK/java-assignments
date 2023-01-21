import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;


public class test1 implements ActionListener
{
    JFrame myframe;
    JLabel f1,f2,ans;
    JTextField t1,t2,t3;
    JButton b1,b2;
    public void initGUI(){
        myframe = new JFrame();
        Container c = myframe.getContentPane();
        c.setLayout(new FlowLayout());
        f1=new JLabel("First");
        f2=new JLabel("Second");
        ans=new JLabel("Answer");
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        b1=new JButton("+");
        b2=new JButton("-");
        c.add(f1);
        c.add(t1);
        c.add(f2);
        c.add(t2);
        c.add(b1);
        c.add(b2);
        c.add(ans);
        c.add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        myframe.setSize(200,200);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        String op,res;
        int n1,n2,r;
        
        
        if(ae.getSource()==b1){
        op=t1.getText();
        n1=Integer.parseInt(op);
        op=t2.getText();
        n2=Integer.parseInt(op);
        r=n1+n2;
        res=r+"";
        t3.setText(res);
        }
        else if(ae.getSource()==b2){
        op=t1.getText();
        n1=Integer.parseInt(op);
        op=t2.getText();
        n2=Integer.parseInt(op);
        r=n1-n2;
        res=r+"";
        t3.setText(res);
        }
    }
    public test1(){
        initGUI();
    }
    public static void main(String args[]){
        test1 p=new test1();
    }
}