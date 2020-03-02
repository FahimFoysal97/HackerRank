/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
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
public class CutTheSticks {
    static int[] cutTheSticks(int[] arr) {
        Vector<Integer> v = new Vector<>();
        while(true){
            Arrays.sort(arr);
            if(arr[arr.length-1]==0)break;
            int smallest=0;
            boolean flag=true;
            int count=0;
            for(int i=0; i<arr.length; i++){
                
                if(arr[i]>0&&flag==true){
                    smallest=arr[i];
                    arr[i]=0;
                    flag=false;
                    count++;
                }
                else if(arr[i]>0&&flag==false){
                    arr[i]-=smallest;
                    count++;
                }
            }
            v.add(count);
        }
        int result[] = new int[v.size()];
        for(int i=0; i<v.size(); i++)result[i]=v.get(i);
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
