import java.util.*;

public class _43_MergeTwoArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Array
        System.out.print("Enter Size of Array1: ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];

        System.out.println("Enter Array1 Elements:");

        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second Array
        System.out.print("Enter Size of Array2: ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter Array2 Elements:");

        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge Arrays
        int merge[] = new int[n1 + n2];

        for(int i = 0; i < n1; i++) {
            merge[i] = arr1[i];
        }

        for(int i = 0; i < n2; i++) {
            merge[n1 + i] = arr2[i];
        }

        // Print Merged Array
        System.out.println("Merged Array:");

        for(int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}

/*
Input:
3
1 2 3

3
4 5 6

Output:
1 2 3 4 5 6
*/