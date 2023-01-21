import java.util.*; 
class Assignment_5 
{
 public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter three numbers: "); 
int a = sc.nextInt(); 
int b = sc.nextInt(); 
int c = sc.nextInt(); 
int max = (a>b)?((a>c)?a:c):((b>c)?b:c); 
System.out.println("Maximum number: " + max); }}  
