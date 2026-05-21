import java.util.Scanner;

public class _20_MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix-1 row and column:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int mat1[][] = new int[r1][c1];

        System.out.println("Enter Matrix-1 elements:");

        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix-2 row and column:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int mat2[][] = new int[r2][c2];

        System.out.println("Enter Matrix-2 elements:");

        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Check addition condition
        if(r1 != r2 || c1 != c2) {
            System.out.println("Matrix Addition Not Possible");
            return;
        }

        int mat3[][] = new int[r1][c1];

        // Addition
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Addition Matrix:");

        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Enter Matrix-1 row and column:
// 2 2

// Enter Matrix-1 elements:
// 1 2
// 3 4

// Enter Matrix-2 row and column:
// 2 2

// Enter Matrix-2 elements:
// 5 6
// 7 8