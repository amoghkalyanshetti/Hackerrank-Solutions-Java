/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author amogh
 */
public class BalancedParenthesisStack 
{
    static Stack stack=new Stack();
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        l1:while (sc.hasNext()) 
        {
            stack.clear();
            String input=sc.next();
            //System.out.println("The input is "+input);
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                char ret=0;
                switch(ch)
                {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(ch);
                        System.out.println(ch+" is pushed");
                        break;
                    case ')':
                        if(!stack.isEmpty())
                        {
                            ret=(char) stack.pop();
                            System.out.println(ret+" is popped");
                            if(ret!='(')
                            {
                                System.out.println("false");
                                continue l1;
                            }
                        }
                        else
                        {
                            System.out.println("false");
                            continue l1;
                        }
                        
                        break;
                    case ']':
                        if(!stack.isEmpty())
                        {
                            ret=(char) stack.pop();
                            System.out.println(ret+" is popped");
                            if(ret!='[')
                            {
                                System.out.println("false");
                                continue l1;
                            }
                        }
                                else
                        {
                            System.out.println("false");
                            continue l1;
                        }
                        
                        break;
                    case '}':
                        if(!stack.isEmpty())
                        {
                            ret=(char) stack.pop();
                            System.out.println(ret+" is popped");
                            if(ret!='{')
                            {
                                System.out.println("false");
                                continue l1;
                            }
                        }
                                else
                        {
                            System.out.println("false");
                            continue l1;
                        }
                        break;
                }
                
                //retChar = (int) stack.pop();
                
            }
            if(stack.isEmpty() )
                System.out.println("true");
            else
                System.out.println("false");
        }
	 	
    }
    
    
            
}
