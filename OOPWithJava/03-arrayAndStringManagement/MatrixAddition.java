/*
Program that asks the user to enter a pair of 3x3 matrices and then it
calculates the sum of them.
*/

// Adrián Navarro Gabino

import java.util.*;

public class MatrixAddition
{
    public static void main(String[] args)
    {
        final int SIZE = 3;
        
        Scanner sc = new Scanner(System.in);
        
        int[][] matrixA = new int[SIZE][SIZE];
        int[][] matrixB = new int[SIZE][SIZE];
        int[][] result = new int[SIZE][SIZE];
        
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                System.out.print("Enter row " + (i+1) + ", column " + (j+1)
                    + " of matrix A: ");
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                System.out.print("Enter row " + (i+1) + ", column " + (j+1)
                    + " of matrix B: ");
                matrixB[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
