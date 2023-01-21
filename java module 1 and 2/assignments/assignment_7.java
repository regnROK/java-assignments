import java.util.*; 
class Assignment_7 { 
 public static void main(String args[]) {   	try (Scanner sc = new Scanner(System.in)) {   	 	System.out.println("Enter the string"); 
   String s;    String str[];    char x; 
	  	 	int count = 0, i; 
	  	 	String input = sc.nextLine(); 
  	 	str = input.split(" "); // convert string to an array   	 	for (i = 0; i < str.length; i++) { 
	  	 	 	s = str[i]; 
    x = s.charAt(0); // checking first letter of each word     if (x <= 90 && x >= 65) 
  	 	 	 	count++;   	 	} 
	  	 	System.out.println(count); 
	  	 	sc.close(); 
	  	} 
  	 
 } 
} 
