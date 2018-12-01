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
public class ArrayGame 
{
    public static boolean canWin(int leap, int[] game) 
    {
        // Return true if you can win the game; otherwise, return false.
        int index=0;
        boolean flag=false;
        while(true)
        {
            if(((index+leap)>(game.length-1)) /*&& game[index+leap]==0*/)//game wins by leap alone
            {
                return true;
            }
            else if((index+leap)<(game.length-1) && game[index+leap]==0)//leap success but no win
            {
                index=index+leap;
                flag=true;
            }
            else if(flag && index-1<(game.length-1) && game[index-1]==0 )//move backward
            {
                index=index-1;
             //   flag=false;
            }
            else if((index+1<game.length-1) && game[index+1]==0)//move foreward
            {
                index=index+1;
                flag=false;
            }
            else
            {
                return false;
            }
        }
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
