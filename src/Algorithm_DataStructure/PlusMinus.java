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


public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int positives = 0;
        int negatives = 0;
        int zeroes = 0;

        for(int n: arr){
            if(n==0)zeroes++;
            else if(n>0)positives++;
            else if(n<0)negatives++;
        }

        DecimalFormat df = new DecimalFormat("#.00000");
        
        System.out.println(df.format( ( (double)positives )/( (double)arr.length) ));
        System.out.println(df.format( ( (double)negatives )/( (double)arr.length) ));
        System.out.println(df.format( ( (double)zeroes )/( (double)arr.length) ));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
