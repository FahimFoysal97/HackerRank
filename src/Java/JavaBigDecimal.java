/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author Foysal
 */

class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, 0, n, (o1, o2) -> {
            BigDecimal bd1 = new BigDecimal(o1);
            BigDecimal bd2 = new BigDecimal(o2);
            return bd2.compareTo(bd1);
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}