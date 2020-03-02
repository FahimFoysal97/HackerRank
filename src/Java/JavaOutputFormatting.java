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
public class JavaOutputFormatting {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int l=s1.length();
                for(int j=0; j<15-l;j++){
                    s1+=" ";
                }
                if(x<10)s1+="00";
                else if(x<100)s1+="0";
                System.out.println(s1+x);
            }
            System.out.println("================================");

    }
}
