import java.io.*;
class inpt1{
public static void main(String args[])
{
try{
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(i);
System.out.println("enter the first number= \n");
String s=b.readLine();
int x=Integer.parseInt(s);
System.out.println("enter the second number= \n");
String o=b.readLine();
int y=Integer.parseInt(o);
System.out.println(x+y);
}
catch(Exception e)
{
System.out.println(e);

}
}

}