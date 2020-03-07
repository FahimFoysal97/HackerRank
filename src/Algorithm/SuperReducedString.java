/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Foysal
 */


public class SuperReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--){
            if (stack.size() > 0 && stack.peek() == s.charAt(i))stack.pop();
            else stack.push(s.charAt(i));
        }
        if(stack.isEmpty())return "Empty String";
        String r = "";
        while(!stack.isEmpty()){
            r+=stack.lastElement();
            stack.remove(stack.lastIndexOf(stack.lastElement()));
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);
        System.out.println(result);
        
        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
