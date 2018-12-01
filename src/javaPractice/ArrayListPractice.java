/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice;

/**
 *
 * @author amogh
 */
import java.io.*;
import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>[] arr=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            int size=sc.nextInt();
            ArrayList<Integer> arrayList=new ArrayList<>();
            for(int j=0;j<size;j++)
            {
                arrayList.add(sc.nextInt());
            }
            arr[i]=arrayList;
        }
        int querySize=sc.nextInt();
        for(int i=0;i<querySize;i++)
        {
            int indexI=sc.nextInt()-1;
            int indexJ=sc.nextInt()-1;
            try
            {
                System.out.println(arr[indexI].get(indexJ));
            }
            catch(IndexOutOfBoundsException ie)
            {
                System.out.println("ERROR!");
            }
        }
    }
}