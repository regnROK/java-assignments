import java.io.*;
class inpt3{
public static void main(String args[])
{
try{
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(i);
System.out.println("enter the first number= \n");
String s=b.readLine();
int x=Integer.parseInt(s);
int p=0;
for(int w=0;w<x;w++){
 for(int q=1;Q<=w;w++){
	if(w%q==0){
	   p++;
	  if(p==2){
		System.out.println(w);
}
}
p=0;
}
}
}
catch(Exception e)
{
System.out.println(e);

}
}

}