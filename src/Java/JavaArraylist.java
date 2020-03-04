/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Foysal
 */
public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
                
        ArrayList<ArrayList<Integer>> lists = new ArrayList();
        for(int row=0; row<n; row++){
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList();
            for(int col=0; col<d; col++){
                list.add(scan.nextInt());
            }
            lists.add(list);
        }
        
        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            if(y<=list.size()){
                System.out.println(list.get(y-1));
            } else{
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
