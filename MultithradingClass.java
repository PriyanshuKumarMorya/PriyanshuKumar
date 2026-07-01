package Hritik;

class Nikhil extends Thread{
    String name;
    Nikhil(String name){
        this.name=name;
    }
     public void run(){
         for(int i=1;i<=5;i++){
             System.out.println(name+" "+i);
         }

     }
}
public class MultithradingClass {
    public static void main(String[] args) {
        Nikhil t1 = new Nikhil("Frist Thread: " );
        Nikhil t2 = new Nikhil("Second Thread: ");
        t1.start();
        t2.start();
    }
}
