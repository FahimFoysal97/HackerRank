/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.util.*;
import java.io.*;
/**
 *
 * @author Foysal
 */
public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int arr[] = new int[n];
            String s = "";

            arr[0]=a+b;
            s+=arr[0];
            for(int j=1;j<n;j++){
                arr[j]=arr[j-1]+b*(int)Math.pow(2, j);
                s+=" "+arr[j];
            }
            System.out.println(s);
        }
        in.close();
        //Math.pow(base, exponent);
    }
}
