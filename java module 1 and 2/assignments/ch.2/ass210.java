import java.util.*;
class bank{
	void disp(){
	System.out.println("rate of interest of this banks :- ");
	}
}

class SBI extends bank{
	void disp(){
	System.out.println("Rate of interest is 7.8%! \n");
	}	
}
class PNB extends bank{
	void disp(){
	System.out.println("rate of interest is 8%! \n");
	}
}
class kotak extends bank{
	void disp(){
	System.out.println("rate of interest is 8.5%! \n");
	}
}
class icici extends bank{
	void disp(){
	System.out.println("rate of interest is 9!");
	}
}

public class ass210{
	public static void main(String args[]){
	bank b=new bank();
	b.disp();
	bank b1=new SBI();
	b1.disp();
	b1=new PNB();
	b1.disp();
	b1=new kotak();
	b1.disp();
	b1=new icici();
	b1.disp();
	}
}