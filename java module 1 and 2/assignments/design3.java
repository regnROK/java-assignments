import java.util.*;

class design3{
public static void main(String args[]){
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of lines = ");
	a=sc.nextInt();
	for(int i=1;i<=a;i++){
		for(int j=a-1;j>=i;j--){
			System.out.print(" ");	
		}
	
		for(int k=1;k<=i;k++){
			System.out.print("*");
		}
		for(int p=2;p<=i;p++){
			System.out.print("*");
		}
		System.out.println("\n");
	}
	for(int i=1;i<=a;i++){
		for(int j=i;j<=a-1;j++){
			System.out.print(" ");	
		}
		for(int k=i;k<=i;k++){
			System.out.print("*");
		}
	}
}
}