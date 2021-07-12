import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int horizontalProduct[][] = new int[20][20];
    static int verticalProduct[][] = new int[20][20];
    static int leftDiagonalProduct[][] = new int[20][20];
    static int rightDiagonalProduct[][] = new int[20][20];

    private static void calculateProducts(int array[][]) {

        for (int i = 0; i <=16; i++)
            for (int j = 0; j < 20; j++)
                horizontalProduct[i][j] = array[i][j] * array[i + 1][j] * array[i + 2][j] * array[i + 3][j];

        for (int i = 0; i < 20; i++)
            for (int j = 0; j <= 16; j++)
                verticalProduct[i][j] = array[i][j] * array[i][j + 1] * array[i][j + 2] * array[i][j + 3];


        for (int i = 0; i <= 16; i++)
            for (int j = 0; j <= 16; j++)
                leftDiagonalProduct[i][j] = array[i][j] * array[i + 1][j + 1] * array[i + 2][j + 2]
                        * array[i + 3][j + 3];

        for (int i = 0; i <= 16; i++)
            for (int j = 4; j < 20; j++)
                rightDiagonalProduct[i][j] = array[i][j] * array[i + 1][j - 1] * array[i + 2][j - 2]
                        * array[i + 3][j - 3];
    }

    public static int maxProduct(int array[][]) {
        calculateProducts(array);

        int maximumProduct = 0;
        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 20; j++)
                maximumProduct = Math.max(maximumProduct,
                        (Math.max((Math.max(leftDiagonalProduct[i][j], rightDiagonalProduct[i][j])),
                                (Math.max(verticalProduct[i][j], horizontalProduct[i][j])))));
        return maximumProduct;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(maxProduct(grid));
    }
}