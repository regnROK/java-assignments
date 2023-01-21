import java.util.*;

public class Matrices1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix 1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter the size of the matrix 2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int matrix1[][] = new int[r1][c1];
        int matrix2[][] = new int[r2][c2];
        int matrix3[][] = new int[r1][c2];

        // 
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Enter " + "[" + (i + 1) + "," + (j + 1) + "]" + " element:");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
               System.out.println("Enter " + "[" + (i + 1) + "," + (j + 1) + "]" + " element:");
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                matrix3[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("The resultant matrix after multiplication is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}