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
public class JavaDatatypes {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808l && x<=9223372036854775807l)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
