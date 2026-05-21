import java.util.*;
public class _06_LargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int num  = sc.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int large = arr[0];
        for(int i=1;i<num;i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        System.out.println("Largest Element From Array = "+large);

    }
}
// Enter Size Of Array:5
// 1
// 3
// 8
// 9
// 2
// Largest Element From Array = 9