// import java.util.Scanner;

// public class _19_FrequencyOfElement {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Size Of Array:");
//         int num  = sc.nextInt();
//         int arr[]= new int[num];
//         for(int i=0;i<num;i++){
//             arr[i]= sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             int count=1;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             System.out.println(arr[i]+"-->"+count);
//         }
//     }
// }

import java.util.Scanner;

public class _19_FrequencyOfElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array: ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {

            int count = 1;
            boolean alreadyCounted = false;

            // Check previous elements
            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if(alreadyCounted) {
                continue;
            }

            // Count frequency
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}
// 1 -> 2
// 2 -> 2
// 3 -> 1