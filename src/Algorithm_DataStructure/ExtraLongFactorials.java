/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_DataStructure;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Foysal
 */
public class ExtraLongFactorials {
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger f = new BigInteger("1");
        for(int i = 2; i <= n; i++){
            BigInteger m = new BigInteger(String.valueOf(i));
            f = f.multiply(m);
        }
        System.out.println(f);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
