import java.util.*;
public class _17_SumOfDigit {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num = sc.nextInt();
        int sum=0;
        while(num>0){
            int ld = num%10;
            sum = sum + ld;
            num = num/10;
        }
        System.out.print("Sum Of Digit = "+sum);
    }
}
// Enter A Number:1234
// Sum Of Digit = 10
// PS D:\Desktop\campus-coding-preparation> java .\_17_SumOfDigit.java
// Enter A Number:436
// Sum Of Digit = 13
