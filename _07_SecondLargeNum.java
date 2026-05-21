import java.util.Scanner;

public class _07_SecondLargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int num  = sc.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int large = arr[0];
        int slarge = arr[0];
        for(int i=1;i<num;i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        for(int i=1;i<num;i++){
            if(slarge<arr[i] && arr[i]!=large){
                slarge = arr[i];
            }
        }
        System.out.println("Largest Element From Array = "+large);
         System.out.println("Second Largest Element From Array = "+slarge);

    }
}
// Enter Size Of Array:5
// 1
// 3
// 8
// 9
// 2
// Largest Element From Array = 9
// Second Largest Element From Array = 8