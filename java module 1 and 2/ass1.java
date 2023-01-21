import java.util.*;
public class ass1
{
int inch;
int feet;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your distance in inch : ");
inch=sc.nextInt();
System.out.println("enter your distance in feet : ");
feet=sc.nextInt();
}
void add(distance temp)
{
int x,y;
x=feet+temp.feet;
y=inch+temp.inch;
if(y>=12)
{
y=y-12;
x++;
}
System.out.println("addition of two distance "+x +":"+y);
}


void disp()
{
System.out.println("distance in inch :" + inch);
System.out.println("distance in feet :" + feet);
}
public static void main(String args[])
{
distance d1=new distance();
d1.getData();
d1.disp();
distance d2=new distance();
d2.getData();
d2.disp();
d1.add(d2);


}
}
