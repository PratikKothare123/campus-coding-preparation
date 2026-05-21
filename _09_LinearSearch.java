import java.util.Scanner;

public class _09_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int num  = sc.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter A Element You want to Find: ");
        int flag=-1;
        int ele = sc.nextInt();
        for(int i=0;i<num;i++){
            if(arr[i]==ele){
                 flag = 1;  
            }
        }

        if(flag==1){
            System.out.println("Element Present");
        }else{
            System.out.println("Not Present");
        }
    }
}
// Enter Size Of Array:5
// 1
// 2
// 3
// 4
// 5


// public class LinearSearch {
//     // Method to perform linear search
//     public static int search(int[] arr, int target) {
//         // Iterate through each element of the array
//         for (int i = 0; i < arr.length; i++) {
//             // Check if the current element matches the target
//             if (arr[i] == target) {
//                 return i; // Target found, return index
//             }
//         }
//         return -1; // Target not found after full traversal
//     }

//     public static void main(String[] args) {
//         int[] data = {10, 50, 30, 70, 80};
//         int target = 30;
        
//         int result = search(data, target);
        
//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.out.println("Element not found in array.");
//         }
//     }
// }
