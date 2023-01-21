class hi extends Thread
{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Hi");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}

class hello extends Thread
{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}

public class test3{
    public static void main(String args[]){
        hi o1 = new hi();
        hello o2= new hello();
        System.out.println(o1.getName());
        System.out.println(o2.getName());
        o1.setName("hi thread");
        o2.setName("hello thread");
        System.out.println(o1.getName());
        System.out.println(o2.getName());
        o1.start();

    try{
        Thread.sleep(10);
    }
    catch(Exception e){
        System.out.println("Exception");
    }
    o2.start(); 
    }
}

