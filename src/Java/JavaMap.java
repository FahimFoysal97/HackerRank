/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Foysal
 */
public class JavaMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int contacts = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<>(contacts);
        for(int i=0; i < contacts; i++){
            String name = in.nextLine().trim();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }        

        while(in.hasNext()){
            String s = in.nextLine().trim();
            if(map.containsKey(s))System.out.println(s + "=" + map.get(s));
            else System.out.println("Not found");
        }
        in.close();
    }
}
