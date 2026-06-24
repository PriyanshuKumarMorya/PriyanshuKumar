package Array;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elements of the array: ");
            arr[i] = sc.nextInt();
        }
        int max =0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
