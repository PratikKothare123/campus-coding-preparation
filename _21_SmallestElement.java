import java.util.Scanner;
public class _21_SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int num  = sc.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.print("Smallest Element: "+smallest);
    }
}
// Enter Size Of Array:5
// 8
// 2
// 9
// 1
// 6
// Smallest Element:1
