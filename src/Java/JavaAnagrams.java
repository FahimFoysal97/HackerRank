/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.util.Scanner;

/**
 *
 * @author Foysal
 */


public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())return false;
        
        char[] aArr = a.toLowerCase().toCharArray();
        char[] bArr = b.toLowerCase().toCharArray();

        int[] counts = new int[26]; 
        for (int i = 0; i < aArr.length; i++){
            counts[aArr[i]-97]++;  
            counts[bArr[i]-97]--;   
        }
        for (int i = 0; i<26; i++)
            if (counts[i] != 0)
                return false;
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
