import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import org.w3c.dom.events.MouseEvent;
class ass2 extends Frame implements MouseInputListener{
ass2() {
addMouseListener(this);
setSize (400, 400);
setLayout (null);
setVisible (true);
}
public static void main(String[] args) {
new ass2();
}
public void mouseClicked(java.awt.event.MouseEvent e) {
System.out.println("Mouse clicked");
}
public void mousePressed(java.awt.event.MouseEvent e) {
System.out.println("Mouse pressed");
}
public void mouseReleased(java.awt.event.MouseEvent e) {
System.out.println("Mouse released");
}
public void mouseEntered(java.awt.event.MouseEvent e) {
System.out.println("Mouse entered");
}
public void mouseExited(java.awt.event.MouseEvent e) {
System.out.println("Mouse exited");
}
public void mouseDragged(java.awt.event.MouseEvent e) {
System.out.println("Mouse dragged");
}
public void mouseMoved(java.awt.event.MouseEvent e) {
System.out.println("Mouse moved");
}
}