package ClassWorks.Maps.lru;

public class Main {
    public static void main(String[] args) {
        SimpleLRUCache<Integer, String> map = new SimpleLRUCache<>(2);
        System.out.println(map);

        map.put(1, "one");
        System.out.println(map);

        map.put(2, "two");
        System.out.println(map);

        map.put(3, "three");
        System.out.println(map);

        map.get(2);
        System.out.println(map);

        map.put(9, "nine");

        System.out.println(map);


    }

}
