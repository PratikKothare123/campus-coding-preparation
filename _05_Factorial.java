import java.util.*;
public class _05_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial Of "+num+" is : "+fact);
    }
}
// Enter A Number:5
// Factorial Of 5 is : 120
// PS D:\Desktop\campus-coding-preparation> java .\_05_Factorial.java
// Enter A Number:3
// Factorial Of 3 is : 6