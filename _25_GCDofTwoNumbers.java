import java.util.*;

public class _25_GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N1: ");
        int n1= sc.nextInt();
        System.out.print("Enter N2: ");
        int n2= sc.nextInt();
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        System.out.print("GCD of "+n1+" And "+n2+" = "+gcd);
    }
}
// Enter N1: 12
// Enter N2: 18
// GCD of 12 And 18 = 6