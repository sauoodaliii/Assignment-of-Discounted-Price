import java.util.Scanner;

public class MagicSquarechecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 numbers for a 3x3 matrix:");

        // Taking input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate sum of first row as reference
        int magicSum = matrix[0][0] + matrix[0][1] + matrix[0][2];

        boolean isMagic = true;

        // Check rows
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        // Check columns
        for (int j = 0; j < 3 && isMagic; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        // Check diagonals
        if (isMagic) {
            int diag1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
            int diag2 = matrix[0][2] + matrix[1][1] + matrix[2][0];

            if (diag1 != magicSum || diag2 != magicSum) {
                isMagic = false;
            }
        }

        // Print result
        if (isMagic) {
            System.out.println("It is a Magic Square.");
        } else {
            System.out.println("It is NOT a Magic Square.");
        }

        sc.close();

    
    }
} 