package ClassWorks;

import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyHashSet {
    static SortedSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        System.out.println(MyHashSet.getNextElement(5));
        System.out.println(MyHashSet.getPrevElements(5));
    }

    static Integer getNextElement(Integer elem) {
        boolean flag = false;
        for (Integer i : set){
            if (flag) {
                return i;
            }
            if (elem.equals(i)){
                flag = true;
            }
        }
        return null;
    }

    static Set<Integer> getPrevElements(Integer elem) {
        Set<Integer> resultSet = new TreeSet<>();
        for(Integer i : set){
            if (i.equals(elem)){
                return resultSet;
            } else {
                resultSet.add(i);
            }
        }
        return null;
    }


}
