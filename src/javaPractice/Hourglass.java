/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice;

import java.util.Scanner;

/**
 *
 * @author amogh
 */
public class Hourglass {

    public static int getHourGlassSum(int[][] arr,int i,int j)
    {
        
        int sum=-999;
        sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        System.out.println("(i,j)=("+i+","+j+")"+" sum is "+sum);
        return sum;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) 
        {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) 
            {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int max=0;
        int newSum=0;
        l1:for(int i=0;i<6;)
        {
            for(int j=0;j<6;)
            {
                if(i==j && j==0)
                {
                    newSum=Hourglass.getHourGlassSum(arr, i, j);
                    if(newSum>max)
                    {
                        max=newSum;
                    }
                    j++;
                    continue;
                }
                if(j==3 && i==3)
                {
                    break l1;
                }
                else if(j==3)
                {
                    j=0;
                    i++;
                }
                else
                {
                    j++;
                }
                newSum=Hourglass.getHourGlassSum(arr,i,j);
                if(newSum>max)
                {
                    max=newSum;
                }                
            }
        }
        System.out.println(max);

        scanner.close();
    }
    
}
