import java.util.*;

public class ass2 {
    public int feet, inch;

    public Distance() {
        this.feet = 5;
        this.inch = 7;
    }

    public Distance(int feet, int inch) {
        this.inch = inch % 12;
        this.feet = feet + inch / 12;
    }

    public Distance(Distance d) {
        this.feet = d.feet;
        this.inch = d.inch;
    }

    public void display() {
        System.out.println(this.feet + "'" + this.inch);
    }

    public void sum(Distance d) {
        this.inch = (this.inch + d.inch) % 12;
        this.feet = (this.feet + d.feet) + d.inch / 12;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Default constructor:");
        ass2 d1 = new ass2();
        d1.display();

        System.out.println("Parameterized constructor:");
        System.out.println("Enter distances in feet and inches respectively: ");
        ass2 d2 = new ass2(sc.nextInt(), sc.nextInt());
        d2.display();

        System.out.println("Copy constructor:");
        ass2 d3 = new ass2(d2);
        d3.display();

    }
}	