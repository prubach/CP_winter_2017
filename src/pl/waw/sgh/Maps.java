package pl.waw.sgh;

import java.util.HashMap;
import java.util.Map;

public class Maps{
    
    


    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();                        //must use objects

        myMap.put("Anna", 4);
        myMap.put("John", 3);
        myMap.put("Christine", 6);

        int count=0;
        int sum=0;


        int sum2=0;
        for (String key: myMap.keySet()) {
            System.out.println(key + "="+myMap.get(key));
            count++;
            sum2 += myMap.get(key);
        }
        System.out.println(count);

        for (int i:myMap.values() //collection of values
             ) {
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("\n\n");

        System.out.println(sum2);



    }


    
    

    
}
