import java.util.Scanner;

public class _29_FindAverageOfNumbers {
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
            sum +=arr[i];
        }
        float avg = sum/arr.length;

        System.out.println("Average of Array: "+avg);
    }
}
// Enter Size Of Array:5
// 10
// 20
// 30
// 40
// 50
// Average of Array: 30.0
