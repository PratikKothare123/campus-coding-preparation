import java.util.*;
class PracticeProblem{


    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // Compare characters at both pointers
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // 1. Reverse a String
        // System.out.print("Enter A String: ");
        // String str = sc.nextLine();
        // for(int i=str.length();i>0;i--){
        //     System.out.print(str.charAt(i-1));
        // }

        //Print Name
        //  System.out.println("Enter a number: ");
        //  int num = sc.nextInt();
        //  for(int i=0;i<num;i++){
        //     System.out.println("Pratik Kothare ");
        //  }


        // Palindrome String
    //    System.out.print("Enter A String: ");
    //    String str = sc.nextLine();
    //     System.out.println(str + " is palindrome? " + isPalindrome(str)); 


    // 3. Palindrome Number
    //  int num = 123214 ;
    //  int newnum = num;
    //  int reverse = 0;
    //  while(num>0){
    //     int ld= num%10;
    //     reverse = reverse * 10 + ld;
    //     num = num/10;
    //  }   
    //     if(reverse != newnum){
    //         System.out.println("Not palindrome");
    //     }else{
    //         System.out.println("Palindrome");
    //     }

    //3. Reverse an Array
    int arr[]={1,2,3,4,5};
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[arr.length-i-1]+" ");
    }
    }
}