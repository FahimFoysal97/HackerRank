/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.io.*;
import java.util.*;

/**
 *
 * @author Foysal
 */


public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        s = s.trim();
        String[] words = s.split("[!,?.*_'@\\ ]+");
        if (s.length()==0){
            System.out.println(0);
            return ;
        }
        int count = words.length;
        System.out.println(count);
        for(String word : words){
            System.out.println(word);
        }
        scan.close();
    }
}