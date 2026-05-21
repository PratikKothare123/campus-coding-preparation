import java.util.Scanner;

public class _24_CountDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.print("Count: "+count);
    }
}
// Enter Number: 2345
// Count: 4
// PS D:\Desktop\campus-coding-preparation> java .\_24_CountDigitInNumber.java
// Enter Number: 98765
// Count: 5