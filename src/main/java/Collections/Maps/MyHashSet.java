package Collections.Maps;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyHashSet {
    static SortedSet<String> set = new TreeSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            set.add(String.valueOf(i));
        }
        //System.out.println(MyHashSet.getNextElement("3"));
        //System.out.println(MyHashSet.getPrevElements("3"));
        String a = "Aklguyiuiyhniouyouiujhopkopwicvoptujdrioptdfgadfgadrtertertrgdfgsdfgasrfwe";
        String ab = "Ab";
        String abc = "AbC";
        String abcd = "AbCd";
        int h;
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        System.out.println((h = a.hashCode()) ^ (h >>> 16));


    }

    static String getNextElement(String elem) {
        boolean flag = false;
        for (String i : set){
            if (flag) {
                return i;
            }
            if (elem.equals(i)){
                flag = true;
            }
        }
        return null;
    }

    static Set<String> getPrevElements(String elem) {
        Set<String> resultSet = new TreeSet<>();
        for(String i : set){

            if (i.equals(elem)){
                return resultSet;
            } else {
                resultSet.add(i);
            }
        }
        return null;
    }


}
