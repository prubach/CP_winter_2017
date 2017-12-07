package pl.waw.sgh;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();

        myMap.put("Anna", 4);
        myMap.put("John", 3);
        myMap.put("Christine", 6);

        int sum = 0;
        for (String key : myMap.keySet()) {
            System.out.println(key + "=" + myMap.get(key));
            sum += myMap.get(key);
        }
        System.out.println("Sum: " + sum);
        sum = 0;
        for (Integer val : myMap.values()) {
            sum += val;
        }
        System.out.println("Sum: " + sum);


    }
}
