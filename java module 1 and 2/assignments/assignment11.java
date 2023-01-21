import java.util.*;

class assignment11{

static void area(int a){
	System.out.println("the area of square = "+(a*a));
}
static void area(int a,int b){
	System.out.println("the area of rectangle = "+(a*b));
}
static void area(int a,int b,int c){
	int s=(a+b+c)/2;
	double p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("the area of triangle is = "+p);
}


public static void main(String args[]){
	area(5);
	area(5,6);
	area(5,6,7);
	}
}