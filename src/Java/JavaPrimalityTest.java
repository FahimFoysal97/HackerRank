/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
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


public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        BigInteger n = scanner.nextBigInteger();

        if(n.isProbablePrime(1))System.out.println("prime");
        else System.out.println("not prime");
        
        scanner.close();
        
    }
}
