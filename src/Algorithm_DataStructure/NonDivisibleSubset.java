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
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Foysal
 */


class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        List<Integer> ss = new ArrayList<>(s);
        for(int i=0; i<s.size(); i++)ss.set(i, new Integer(s.get(i).intValue()%k));
        System.out.println(ss);
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        for(int i=0; i<s.size()-1; i++){
            for(int j=i+1; j<s.size(); j++){
                if( (ss.get(i)+ss.get(j))==k ){
                    s1.add(s.get(i));
                    s2.add(s.get(j));
                }
            }
        }
        List<Integer> st = new ArrayList<>(s1);
        s1.removeAll(s2);
        s2.removeAll(st);
        System.out.println(s1);
        System.out.println(s2);
        HashSet<Integer> hs1 = new HashSet<>(s1);
        hs1.addAll(s2);
        System.out.println(hs1);
        return hs1.size();
    }

}

public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
