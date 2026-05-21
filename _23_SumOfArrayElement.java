import java.util.Scanner;

public class _23_SumOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int num  = sc.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("Sum Of Array Element is = "+sum);
    }
}
// Enter Size Of Array:5
// 1
// 2
// 3
// 4
// 5
// Sum Of Array Element is = 15