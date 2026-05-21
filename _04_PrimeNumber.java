import java.util.Scanner;

public class _04_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num = sc.nextInt();
        
        if(num==2){
            System.out.println(num+": IS Prime Number");
        //  isPrime = true;
        }
        else{
            boolean isPrime = true;
            for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime = false;
            }
        }

        if(isPrime == true){
        System.out.println(num+": IS Prime Number");
        }else{
            System.out.println(num+" IS NOT Prime Number");
        }
        }
    }
}
// Enter A Number:6
// 6 IS NOT Prime Number
// PS D:\Desktop\campus-coding-preparation> java .\_04_PrimeNumber.java
// Enter A Number:7
// 7: IS Prime Number