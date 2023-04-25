package adv;

import java.util.HashMap;


public class HashMapExm {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }
//        for (String i : capitalCities.values()) {
//            System.out.println(i);
//        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}