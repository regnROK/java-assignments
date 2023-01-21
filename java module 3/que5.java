import java.io.*; 
import java.util.*; 
 
class Student{     String name; 
    String age; 
    String collegeName; 
    String branch; 
    String batchYear; 
 
    Student(String iname, String iage, String icollegeName, String ibranch, String ibatchYear){         name=iname; 
        age=iage; 
        collegeName=icollegeName;         branch=ibranch;         batchYear=ibatchYear; 
    } 
} 
 
public class Que5{ 
 
    //function to write data in the file 
    public static void WriterInFile(BufferedWriter fp) throws IOException{         Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter name of student: "); 
        String sname = sc.nextLine(); 
        System.out.print("Enter age of student: "); 
        String sage = sc.nextLine(); 
        System.out.print("Enter college name of student: "); 
        String scollegeName = sc.nextLine(); 
        System.out.print("Enter branch of student: "); 
        String sbranch = sc.nextLine(); 
        System.out.print("Enter batch of student: "); 
        String sbatch = sc.nextLine(); 
 
        Student s = new Student(sname, sage, scollegeName, sbranch, sbatch); 
 
        // writing data to the file 
        fp.write("Name: " + s.name + ", Age: " + s.age + ", College: " + 
s.collegeName + ", Branch: " + s.branch + ", Batch: " + s.batchYear + "\n");         fp.flush(); 
    } 
 
    //function to write specific line to a file 
    public static void SpecificLineWriter(BufferedWriter fp2, String line) throws IOException{ 
        fp2.write(line+"\n"); 
        fp2.flush(); 
    } 
 
    //function to read required data from the file 
    public static void ReaderForFile(File file) throws IOException {         Scanner sc = new Scanner(System.in); 
 
        BufferedReader fr = new BufferedReader(new FileReader(file)); 
        System.out.print("\nEnter the Name of the student to get details: "); 
        String search = sc.nextLine(); 
        System.out.println("\n"); 
 
        String line = fr.readLine(); 
        boolean found = false; 
 
        while (line != null) {             if (line.contains(search)) {                 System.out.println(line);                 found = true;                 break; 
            }             else {                 found = false;                 line = fr.readLine(); 
            } 
        } 
        if (!found) { 
            System.out.println("No such Name found!"); 
        } 
        fr.close(); 
    } 
 
    //function to modify details of a student 
    public static void ModifyDetails(File file) throws IOException{ 
        Scanner sc = new Scanner(System.in); 
 
        BufferedReader br1 = new BufferedReader(new FileReader(file)); 
 
        File file2 = new File("D:\\vs code\\java vscode\\module 3\\Assignment3\\que5\\writeme2.txt"); 
 
        BufferedWriter fp2 = new BufferedWriter(new FileWriter(file2)); 
 
        System.out.print("Enter the Name of student to modify details: "); 
        String search = sc.nextLine(); 
        System.out.println("\n"); 
 
        String line = br1.readLine(); 
        boolean found = false; 
 
        while (line != null) {             if (line.contains(search)) {                 WriterInFile(fp2);                 found = true;                 line = br1.readLine(); 
            } 
            else { 
                SpecificLineWriter(fp2,line);                 line = br1.readLine(); 
            } 
        } 
        if (found == false) { 
            System.out.println("No such Name found!"); 
        } 
 
        file2.renameTo(file); 
        System.out.println("Details Modified Successfully!\n");         br1.close(); 
    } 
 
    public static void main(String args[]) throws IOException{ 
        Scanner sc = new Scanner(System.in); 
        File file = new File("D:\\vs code\\java vscode\\module 3\\Assignment3\\que5\\writeme.txt"); 
 
        BufferedWriter fp = new BufferedWriter(new FileWriter(file)); 
 
        int choice = 0; 
 
        while (choice != 4){ 
            System.out.println("\n\nEnter a choice"); 
            System.out.println("1: Add info"); 
            System.out.println("2: Read info"); 
            System.out.println("3: Modify info"); 
            System.out.println("4: Exit"); 
 
            choice = sc.nextInt();             sc.nextLine(); 
 
            switch(choice){ 
                 case 1: 
                    WriterInFile(fp); 
                    break; 
                 case 2: 
                    ReaderForFile(file); 
                    break; 
 
                case 3: 
                    ModifyDetails(file); 
                    break; 
                 case 4: 
                    System.out.println("\n\nThank You");                     break; 
                 default: 
                    System.out.println("\n\nEnter a valid choice!");                     break; 
            }         }         sc.close();         fp.close(); 
    } 
} 
 
