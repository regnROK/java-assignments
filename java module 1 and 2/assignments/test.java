import java.util.*;
class assignment6
{
     public static void main(String args[])
     {
          int v=0, c=0;
          char x;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the sentence:");
	    string[] array = new string[10];	
          String array[]=sc.nextLine();
          str=str.toLowerCase();
          for(int i=0; i<str.length; i++)
           {
              x=str.charAt(i);

              if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' )
               v++;

              else
                   if(x==' ')
                   continue;
                   else
                   c++;
           }
           System.out.println("vowel");
			System.out.println(v);
           System.out.println("consonant");
           System.out.println(c);
          
     }
}




import java.util.*;
class assignment7
{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           String s, inp;
           String str[];
           char x;
           int count=0, i;
           inp=sc.nextLine();
           str=inp.split(" ");
         
           for(i=0; i<str.length; i++)
           {
            s=str[i];
            x=s.charAt(0);
            if(x<=90 && x>=65)
            count++;
           }
           System.out.println(count);
     }
}
