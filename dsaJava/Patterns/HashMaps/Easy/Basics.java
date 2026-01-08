package Patterns.HashMaps.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basics {
    public static void main(String[] args) {

        HashMap<String , Integer> map = new HashMap<>();
        //      key    , value
        map.put("India" , 12000);
        map.put("Dholakpur" , 9000);
        map.put("Nepal" , 8000);
        map.put("China" , 7000);

        System.out.println(map.get("Nepal"));
        map.put("China" , 6000);
//        System.out.println(map);
        if (map.containsKey("hindi")){
            System.out.println("Key is present and the values are "+ map.get("India"));
        }
        else System.out.println("Not found");

        for (Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys){
            System.out.println(key +" " + map.get(key));
        }
        map.remove("China");
        System.out.println(map);

    }



}
