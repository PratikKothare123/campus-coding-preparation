import java.util.Scanner;

public class _11_StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
// Enter A String: Pratik
// kitarP
// PS D:\Desktop\campus-coding-preparation> java .\_11_StringReverse.java
// Enter A String: hello
// olleh