import java.util.Scanner;

public class _10_EvenOddCount {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int num  = sc.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int evenCount=0,oddCount=0;
        for(int i=0;i<num;i++){
            if(arr[i]%2==0){
                evenCount +=1;
            }else{
                oddCount+=1;
            }
        }
        System.out.println("EventCount: "+evenCount);
        System.out.println("OddCount: "+oddCount);
 }   
}
// Enter Size Of Array:5
// 1
// 2
// 3
// 4
// 5
// EventCount: 2
// OddCount: 3