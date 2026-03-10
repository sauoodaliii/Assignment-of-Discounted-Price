import java.util.Scanner;

public class MagicMatrixCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];

        System.out.println("Enter 9 values for the 3x3 matrix:");

        int num = 1;

        // Taking input
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Value " + num + ": ");
                grid[r][c] = sc.nextInt();
                num++;
            }
        }

        int targetSum = 0;

        // Sum of first row
        for (int c = 0; c < 3; c++) {
            targetSum += grid[0][c];
        }

        boolean magic = true;

        // Check rows
        for (int r = 0; r < 3; r++) {
            int sumRow = 0;
            for (int c = 0; c < 3; c++) {
                sumRow += grid[r][c];
            }
            if (sumRow != targetSum) {
                magic = false;
            }
        }

        // Check columns
        for (int c = 0; c < 3; c++) {
            int sumCol = 0;
            for (int r = 0; r < 3; r++) {
                sumCol += grid[r][c];
            }
            if (sumCol != targetSum) {
                magic = false;
            }
        }

        // Check diagonals
        int diagonal1 = grid[0][0] + grid[1][1] + grid[2][2];
        int diagonal2 = grid[0][2] + grid[1][1] + grid[2][0];

        if (diagonal1 != targetSum || diagonal2 != targetSum) {
            magic = false;
        }

        if (magic) {
            System.out.println("The matrix is a Magic Matrix.");
        } else {
            System.out.println("The matrix is NOT a Magic Matrix.");
        }

        sc.close();
    }
}