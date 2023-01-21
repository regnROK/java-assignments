 
import java.util.*; 
 
class NotSufficientBalance extends Exception{ 
    public NotSufficientBalance(String str){         super(str); 
    } 
} 
 
class bank{ 
    int balance=1000;     String name;     int id;     bank(String name, int id){ 
        name = this.name;         id = this.id; 
    } 
 
    void withdraw(){ 
 
    } 
 
    void deposit(){ 
 
    } 
} 
 
public class que10{ 
 
    static void checkAndWithdraw(bank b, int withdraw) throws NotSufficientBalance{         if (withdraw > b.balance){ 
            throw new NotSufficientBalance("No sufficient Balance!"); 
        } 
        else{ 
            b.balance -= withdraw; 
            System.out.println("Thank You for making a transaction."); 
        } 
    } 
 
    public static void main(String args[]){         Scanner sc = new Scanner (System.in); 
 
        bank arr[] = new bank[4]; 
 
        int choice = 1;         String name;         int id; 
 
        do{ 
            System.out.println("-----------------------Welcome to our Bank----------------------"); 
            System.out.println("Enter choice: "); 
            System.out.println("1. Make an account"); 
            System.out.println("2. Make a deposit"); 
            System.out.println("3. Withdraw"); 
            System.out.println("4. Exit"); 
            System.out.print("Choice:  "); 
         
 
            choice = sc.nextInt();             sc.nextLine(); 
 
            switch (choice){                 case 1: 
                    //make an account 
                    System.out.println("Enter your name: ");                     name = sc.nextLine(); 
                    System.out.print("Enter your id no: (0-3)");                     id = sc.nextInt(); 
                    if (id>3){ 
                        System.out.println("No account found!");                         break; 
                    } 
                    arr[id] = new bank(name, id); 
                    System.out.println("An account with the name "+name+" with id "+id+" with an initial amount of 1000 (to be deposited at the counter) is made successfully!"); 
                    break; 
                 case 2:                     //deposit 
                    System.out.println("Enter your name: ");                     name = sc.nextLine(); 
                    System.out.print("Enter your id no: (0-3)");                     id = sc.nextInt(); 
                    if (id>3){ 
                        System.out.println("No account found!");                         break; 
                    } 
                    System.out.print("Enter the deposit amount: "); 
                    int deposit = sc.nextInt();                     arr[id].balance += deposit; 
                    System.out.println("Deposit made successfully!");                     System.out.println("New Balance: "+arr[id].balance);                     break; 
                 case 3:                     //withdraw 
                    System.out.println("Enter your name: "); 
                    name = sc.nextLine(); 
                    System.out.print("Enter your id no: (0-3)");                     id = sc.nextInt();                     if (id>3){ 
                        System.out.println("No account found!");                         break; 
                    } 
                    System.out.print("Enter an amount to withdraw: ");                     int withdraw = sc.nextInt(); 
 
                    try{ 
                        checkAndWithdraw(arr[id],withdraw); 
                    } 
                    catch(NotSufficientBalance e){ 
                        System.out.println(e); 
                    } 
                    System.out.println("New Balance: "+arr[id].balance);                     break; 
                 case 4:                     //exit 
                    System.out.println("Thank You for using our bank.");                     break; 
                 default: 
                    choice = 1; 
                    System.out.println("Enter a valid choice!\n");                     break; 
            } 
        } 
        while (choice != 4); 
        sc.close(); 
    } 
} 
