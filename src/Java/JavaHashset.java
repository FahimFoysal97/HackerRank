/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Foysal
 */
public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        HashSet<String> h= new HashSet<>();
        for (int i = 0; i < t; i++) {
            h.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(h.size());
        }
   }
}
