import java.util.LinkedHashSet;
public class _18_RemoveDuplicateFromArray {
       public static void remove(int[] a)
       {
            LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();

                // adding elements to LinkedHashSet
                for (int i = 0; i < a.length; i++)
                s.add(a[i]);

               System.out.print(s);
        }
    public static void main(String[] args) {
                int a[] = {1, 2, 2, 3, 4, 4};
    
                // Function call
                remove(a);
    }
}
// [1, 2, 3, 4]