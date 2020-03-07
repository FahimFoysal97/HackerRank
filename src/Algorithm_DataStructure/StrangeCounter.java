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

public class StrangeCounter {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        long rn;
        rn =  (long) (Math.log( (t+2)/3 )/Math.log(2)+1e-10);
        System.out.println("R^n:"+rn);
        System.out.println("Upper:"+((long)Math.pow(2, rn))*3);
        System.out.println("Lower:"+(((long)Math.pow(2, rn))*3-2));
        return ((long)Math.pow(2, rn)*3) - (t-(((long)Math.pow(2, rn))*3-2));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
