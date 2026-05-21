import java.util.Scanner;

public class _32_CountPositiveAndNegative {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int num  = sc.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int posCount=0,negcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posCount++;
            }else{
                negcount++;
            }
            }
            
            System.out.println("Positive: "+posCount);
            System.out.println("Negative: "+negcount);

}
}
// Enter Size Of Array:5
// -1
// 2
// -3
// 4
// 5
// Positive: 3
// Negative: 2
