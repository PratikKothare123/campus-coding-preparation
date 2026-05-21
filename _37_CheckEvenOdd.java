import java.util.Scanner;

public class _37_CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
// Enter a number: 4
// Even Number
// PS D:\Desktop\campus-coding-preparation> java .\_37_CheckEvenOdd.java
// Enter a number: 7
// Odd Number