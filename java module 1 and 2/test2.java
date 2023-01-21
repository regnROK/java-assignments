public class test2 implements Runnable{
    public static int amount =0;
    
    public static void main(String args[]){
        test2 p1=new test2();
        Thread s1=new Thread(p1);
        s1.start();
        while(s1.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
       amount++;
    }
}