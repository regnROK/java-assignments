import java.util.*;

class design{
 public static void main(String args[]){
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of lines = \n");
	a=sc.nextInt();
	for(int i=1;i<=a;i++){
	  for(int j=i;j<=a-1;j++){
		System.out.print(" ");
		}
	  for(int p=1;p<=i;p++){
		System.out.print(p);
		}
	  for(int q=i-1;q>=1;q--){
		if(i==1){
			System.out.print(" ");
			}
		else
			System.out.print(q);
		}
	System.out.println("\n");
	}
   }
}