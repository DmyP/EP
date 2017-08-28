package Collections.Maps;

import java.util.HashMap;

public class MyLinkedHashMap {


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println(map);
        map.put(1, "0");
        map.put(2, "0");
        map.put(3, "0");
        System.out.println(map);
    }
}
