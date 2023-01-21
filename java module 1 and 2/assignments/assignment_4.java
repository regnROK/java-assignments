import java.util.Scanner;

public class assignment_4 {
    public static void subject(){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("how many marks of paper was yours");
            int total=sc.nextInt();
            int total_marks=total*5;
            System.out.println("total marks "+total_marks);

            System.out.println("enter Maths marks");
            float m=sc.nextFloat();

            System.out.println("enter Science marks");
            float s=sc.nextFloat();

            System.out.println("enter Gujarati marks");
            float g=sc.nextFloat();

            System.out.println("enter Social Study marks");
            float ss=sc.nextFloat();

            System.out.println("enter English marks");
            float e=sc.nextFloat();

            float sum=m+s+ss+e+g;
            System.out.println("The sum of 5 subject out of " + total_marks + " is " + sum);
            float pr=0;
            pr=(100*sum)/total_marks;
            System.out.println("The percentage of your "+pr);
        }

    }   
        public static void main(String[] args) {
            System.out.println("This is a percentage genrater");
            System.out.println("Enter the marks of the subject");
            subject();
            
        }
        
}