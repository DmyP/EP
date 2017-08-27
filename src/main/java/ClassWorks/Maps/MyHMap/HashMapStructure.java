package ClassWorks.Maps.MyHMap;


import java.util.HashMap;
import java.util.Iterator;

public class HashMapStructure {
    public static void main(String[] args) {

        Country india=new Country("India",1000);
        Country japan=new Country("Japan",10000);

        Country france=new Country("France",2000);
        Country russia=new Country("Russia",20000);

        HashMap<Country, String> countryCapitalMap=new HashMap<Country,String>();
        countryCapitalMap.put(india,"Delhi");
        System.out.println(india.hashCode());
        countryCapitalMap.put(japan,"Tokyo");
        System.out.println(japan.hashCode());
        countryCapitalMap.put(france,"Paris");
        System.out.println(france.hashCode());
        countryCapitalMap.put(russia,"Moscow");
        System.out.println(russia.hashCode());

        Iterator countryCapitalIter=countryCapitalMap.keySet().iterator();//put debug point at this line
        while(countryCapitalIter.hasNext())
        {
            Country countryObj = (Country) countryCapitalIter.next();
            String capital=countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName()+"----"+capital);
        }
    }



}
