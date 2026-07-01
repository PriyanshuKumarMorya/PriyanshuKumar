package Hritik;

class T implements Runnable{
    public void run(){
       for(int i=1;i<=5;i++){
           System.out.println("I :"+i);
       }}}
class U implements Runnable{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("J :"+j);
        }}}
class V implements Runnable{
    public void run(){
        for(int K=1;K<=10;K++){
            System.out.println("K :"+K);
        }}}

public class HritikRunnableThread {
    public static void main(String[] args) {
        T q1 = new T();
        Thread q = new Thread(q1);
        q.start();
        Thread r = new Thread(new U());
        r.start();
        Thread s = new Thread(new V());
        s.start();

    }
}
