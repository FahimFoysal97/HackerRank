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

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        String B = sb.reverse().toString();
        if(A.equals(B))System.out.println("Yes");
        else System.out.println("No");
        
    }
}