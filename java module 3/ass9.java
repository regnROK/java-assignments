import java.util.*;

class AgeIsNegative extends Exception {
    private String errorMessage;
    public AgeIsNegative(String error) {
        this.errorMessage = error;
    }
    public String toString() {
        return this.errorMessage;
    }
}

public class ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int a = sc.nextInt();
            if(a < 0)
                throw new AgeIsNegative("Age cannot be negative");
        } catch(AgeIsNegative ex) {System.out.println(ex);}
    }
}