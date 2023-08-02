package matrix;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
//        int row=3;
//        System.out.println("Enter the rows");
//        int column=2;
        int a[][]=new int[2][3];
        int max=0;
        Scanner sc= new Scanner(System.in);
//        int r=sc.nextInt();
//        System.out.println("enter the column");
//        int c=sc.nextInt();
        System.out.println("enter the "+ 6  +" elements");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+ " ");

            }
            System.out.println();
        }
         max =  a[0][0];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
