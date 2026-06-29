package DSA;
import java.util.*;
public class FibonacciRecursion {
      static int fibb(int i ){
          if(i==0 ||  i==1){
              return i;
          }
          return fibb(i-1)+fibb(i-2);
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++) {
            System.out.print(fibb(i)+" ");
        }

    }
}
