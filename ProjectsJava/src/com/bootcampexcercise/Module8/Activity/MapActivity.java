package com.bootcampexcercise.Module8.Activity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        //2 - Call print method to print the map passed as its parameter.

        Map names = new HashMap();
        names.put("1", "Kristina");
        names.put("2", "Tom");
        names.put("3", "Jurga");

        MapActivity obj = new MapActivity();
        obj.print(names);
    }

    void print(Map map)
    {
        Set keySet = map.keySet();

        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator iterat = keySet.iterator();
        while (iterat.hasNext()){
            String key = (String) iterat.next();
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println("*************************************");

    }
}
