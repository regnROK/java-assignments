import java.util.*;

class design2{
public static void main(String args[]){
      int a;
   	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of line = ");
	a=sc.nextInt();
	for(int i=1;i<=a;i++){
		for(int j=1;j<=i;j++){
		    System.out.print("*");	
		}
		for(int p=(2*a-2);p>=(2*i-1);p--){
		    System.out.print(" ");	
		}
		for(int j=1;j<=i;j++){
		    System.out.print("*");	
		}
		System.out.println("\n");
	}
	for(int i=a;i>=1;i--){
		for(int j=i;j>=1;j--){
			System.out.print("*");
		}
		for(int p=(2*i-1);p<=(2*a-2);p++){
		    System.out.print(" ");	
		}
		for(int k=i;k>=1;k--){
			System.out.print("*");
		}
		System.out.println("\n");	
	}
	 	
   }
}
 