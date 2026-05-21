import java.util.Scanner;

public class _16_ArmstrongNumber {
    public static int countDigit(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int temp = num;      
        // Mistake: Modifying the original 'num' variable reduces it to 0, which breaks the final 'if(num==sum)' comparison.

        int  p =  countDigit(num);
        int sum=0;
        while(temp>0){
            int ld= temp%10;
            sum = sum + (int)Math.pow(ld, p);
            temp= temp/10;
        }
        if(num==sum){
            System.out.println("Armstrong ");
        }else{
            System.out.println("Not Armstrong ");
        }
    }
}
// Enter Number: 153
// Armstrong 
// PS D:\Desktop\campus-coding-preparation> java .\_16_ArmstrongNumber.java
// Enter Number: 123
// Not Armstrong 






// Short Explanations for CommentsIf you prefer shorter options, 
// you can use one of these:Option 
// 1: // Mistake: 'num' becomes 0 after the loop, so 'num==sum' always fails.Option 
// 2:Mistake: Original number is destroyed during digit extraction.