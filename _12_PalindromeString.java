import java.util.Scanner;

public class _12_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String str = sc.nextLine();
        int n = str.length();
        boolean isPalindrome= false;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                isPalindrome = true;
            }
        }
        if(isPalindrome==false){
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }

    }
}
// Enter A String: madam
// Palindrome
// PS D:\Desktop\campus-coding-preparation> java .\_12_PalindromeString.java 
// Enter A String: racecar
// Palindrome