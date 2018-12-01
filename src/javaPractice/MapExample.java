/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author amogh
 */
public class MapExample 
{
    public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
                HashMap<String,Integer> hm=new HashMap();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
                        hm.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
                        if(hm.get(s)==null)
                        {
                            System.out.println("Not found");
                        }                        
                        else
                        {
                            System.out.println(s+"="+hm.get(s));
                        }
		}
	}
}
