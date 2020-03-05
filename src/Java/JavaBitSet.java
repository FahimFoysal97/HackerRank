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


public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        BitSet[] B = new BitSet[3];
        for (int i = 1; i < B.length; i++) {
            B[i] = new BitSet(N);
        }
        for (int i = 0; i < M; i++) {
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch (operation) {
                case "AND":
                    B[x].and(B[y]);
                    break;
                case "OR":
                    B[x].or(B[y]);
                    break;
                case "XOR":
                    B[x].xor(B[y]);
                    break;
                case "FLIP":
                    B[x].flip(y);
                    break;
                case "SET":
                    B[x].set(y);
                    break;
                default:
                    break;
            }

            System.out.println(B[1].cardinality() + " " + B[2].cardinality());
        }
        sc.close();
    }
}