package PraticeProgram.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapsInterface {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("itish",30);
        map.put("taylor",13);
        map.put("the weeknd",16);
        map.put("selena",22);

        System.out.println(map);
//        map.remove("itish");
        System.out.println(map);
        boolean res = map.containsKey("selea");
        System.out.println(res);
        System.out.println(map.get("itish"));
        System.out.println(map.containsValue(16));

        map.put("taylor",2344);
        map.replace("taylor",13);
        map.putIfAbsent("taylor",8554);



        for(Map.Entry m : map.entrySet()){
            System.out.println(m);
        }
    }
}
