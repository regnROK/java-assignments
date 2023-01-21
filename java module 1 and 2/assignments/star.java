import java.util.Scanner;
class star
{
   public static void main(String args[])
    {  
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number = ");
	int x=sc.nextInt();

         for(int i=1;i<=x; i++)
         {
               for(int j=1; j<=(x-i); j++)
               {
                     System.out.print(" ");
               }
               for(int k=1; k<=(2i-1); k++)
                     {
                         System.out.print("*");
                     }
                    
         }
         System.out.println(" ");
    }
}