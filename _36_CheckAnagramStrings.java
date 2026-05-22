import java.util.*;

public class _36_CheckAnagramStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        // Convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Convert strings to char array
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

/*
Input:
listen
silent

Output:
Anagram
*/
