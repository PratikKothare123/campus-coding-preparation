import java.util.*;

public class _44_FindDuplicateElementsInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate Elements:");

        for(int i = 0; i < n; i++) {

            boolean alreadyPrinted = false;

            // Check previous elements
            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(alreadyPrinted) {
                continue;
            }

            // Check duplicates
            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}

/*
Input:
6
1 2 3 2 4 1

Output:
1 2
*/