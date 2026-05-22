import java.util.*;

public class _42_FindMissingNumberInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = (arr[0] + arr[n - 1]) * (n + 1) / 2;

        int actualSum = 0;

        for(int i = 0; i < n; i++) {
            actualSum = actualSum + arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);
    }
}

/*
Input:
5
1 2 3 5 6

Output:
4
*/