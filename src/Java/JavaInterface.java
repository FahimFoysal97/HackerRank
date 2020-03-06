/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.util.*;

/**
 *
 * @author Foysal
 */

interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here

class MyCalculator1 implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n){
        int sum=0;
        int sqrt=(int)Math.sqrt(n);
        for(int i=1; i<=sqrt; i++)if(n%i==0) sum+=i+n/i;
        if(sqrt*sqrt == n)sum-=sqrt;
        return sum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator1 my_calculator = new MyCalculator1();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}

