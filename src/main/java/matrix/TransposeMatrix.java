package matrix;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the rows");
        int rows= sc.nextInt();
        System.out.println("enter the column");
        int column=sc.nextInt();
        int a[][]=new int [rows][column];
        System.out.println("enter the " +3*2+" elements ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(a[j][i] +" " );
            }
            System.out.println();
        }


    }
}
