package Collections.Maps.WeakMap;

import java.util.WeakHashMap;

public class WeakMap {
    public static void main(String[] args) {
        WeakHashMap<Data, String> map = new WeakHashMap<>();
        Data data = new Data();
        map.put(data, "one");

        data = null;

      System.gc();

        for (int i = 0; i < 10000000; i++) {
           // System.out.println(i);
            if (map.isEmpty()) {
                System.out.println("Deleted - " + i);
                break;
            }
        }
    }
}
class Data {

}
