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

public class ListOperations {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list1.add(sc.nextInt());
        }
        int noOfQueries=sc.nextInt();
        
        for(int i=0;i<noOfQueries;i++)
        {
            
            String s1=sc.next();
            
            System.out.println("The query is "+s1);
            if(("Insert").equals(s1))
            {
                int index=sc.nextInt();
                int value=sc.nextInt();
                list1.add(index,value);
            }
            else if("Delete".equals(s1))
            {
                int index=sc.nextInt();
                int deletedElement=list1.remove(index);
                System.out.println("The element deleted is "+deletedElement);
            }
        }
        for(Integer i:list1)
        {
            System.out.print(i+" ");
        }
    }
}
