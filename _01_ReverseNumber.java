import java.util.*;

public class _01_ReverseNumber {

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
        System.out.println("Reverse of "+n+" is = "+result);

    }
}
// Enter A Number:
// 1234
// Reverse of 1234 is = 4321