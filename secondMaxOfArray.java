import java.util.Scanner;

public class secondMaxOfArray {
    static int findmax(int arr[]){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx = arr[i];

            }
        }
        return mx;
    }
    static int findSecondMax(int arr[]){
        int mx = findmax(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
     int secondMax = findmax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter a array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSecondMax(arr));
    }
}
