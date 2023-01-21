import java.util.*;
class ass10
{
   public static void main(String args[])
   {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number:");
          int n=sc.nextInt();
          
          for(int i=1; i<=n; i++)
          {
               for(int j=1; j<=(n-i); j++)
               {
                    System.out.print(" ");
               }
                   
               for(int k=1; k<=i; k++)
               System.out.print("* ");

               
               System.out.println(" ");

          }

          for(int l=1; l<=n-1; l++)
          {
               for(int m=1; m<=l; m++)
               {
                    System.out.print(" ");
               }
                   
               for(int o=n-l; o>=1; o--)
               System.out.print("* ");

               
               System.out.println(" ");

          }
          
   }
}