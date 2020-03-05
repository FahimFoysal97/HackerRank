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
        Scanner scan = new Scanner(System.in);
        int contacts = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> map = new HashMap<>(contacts);
        for(int i=0; i < contacts; i++){
            String name = scan.nextLine().trim();
            int phone = scan.nextInt();
            scan.nextLine();
            map.put(name, phone);
        }        

        while(scan.hasNext()){
            String query = scan.nextLine().trim();
            if(map.containsKey(query))System.out.println(query + "=" + map.get(query));
            else System.out.println("Not found");
        }
        scan.close();
    }
}
