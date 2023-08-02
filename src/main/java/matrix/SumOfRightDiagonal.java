package matrix;

import java.util.Scanner;

public class SumOfRightDiagonal {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println(3*3+ " enter the elements ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    sum+= a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
