import java.util.Scanner;

public class _02_PalindromeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int num  = sc.nextInt();
        int n = num;
        int result =0;
        while(num>0){
            int lastdigit = num % 10;
            result = result * 10 + lastdigit;
            num = num/10;
        }
        if(n==result){
            System.out.println("number is Palindrome");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}
// 121
// number is Palindrome