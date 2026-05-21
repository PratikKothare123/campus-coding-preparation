import java.util.Scanner;

public class _03_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = sc.nextInt();
        int n1=0,n2=1;
        for(int i=0;i<num;i++){
            System.out.print(n1+" ");
            int newterm = n1+n2;
            n1 = n2;
            n2= newterm;
        }
    }
}

// Enter A Number: 5
// 0 1 1 2 3 