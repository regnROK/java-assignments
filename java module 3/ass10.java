import java.util.*;

class ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your balance: ");
        float amt, balance = sc.nextFloat();

        try {
            while(true) {
                System.out.print("Enter withdrawal amount: ");
                amt = sc.nextFloat();
                if(amt > balance)
                    throw new Exception();
                balance -= amt;
                System.out.println("Updated balance: " + balance);
            }
        } catch(Exception ex) {System.out.println("Not sufficient funds");}
    }
}