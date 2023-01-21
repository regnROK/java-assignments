import java.util.*; 
 
class assignment_6 {     public static void main(String args[]) {         System.out.println("Enter the string"); 
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();         str = str.toLowerCase(); 
        int c = 0, v = 0; 
        for (int i = 0; i < str.length(); i++) {             char x = str.charAt(i); 
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {                 v++; 
            } else if (x == ' ') {                 continue;             } else {                 c++; 
            } 
        } 
        System.out.println("number of vowals" + v);         System.out.println("number of consonent" + c);         sc.close(); 
    } 
 
} 
