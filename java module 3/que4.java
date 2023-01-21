import java.io.FileInputStream; import java.io.FileOutputStream; 
import java.util.*; 
 
public class que4 { 
    public static void main(String[] args) { 
        System.out.println("Enter Student Information");         try { 
            FileOutputStream fout = new FileOutputStream("stdinfo.txt"); 
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter Name:"); 
            String name = sc.nextLine(); 
            System.out.print("Enter Semester:"); 
            String sem = sc.nextLine(); 
            System.out.print("Enter Course:"); 
            String cr = sc.nextLine(); 
            String str = "Name : " + name + "\n" + "Samester : " + sem + "\n" + 
"Course : " + cr; 
            byte b[] = str.getBytes();             fout.write(b);             fout.close(); 
        } catch (Exception e) { 
            System.out.println(e); 
        } 
        System.out.println("\n\n<---------Student Infromation--------->");         try { 
            FileInputStream fin = new FileInputStream("stdinfo.txt");             int i = 0; 
            while ((i = fin.read()) != -1) {                 System.out.print((char) i); 
            } 
            fin.close(); 
        } catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
} 
