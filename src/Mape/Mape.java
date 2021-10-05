package Mape;

import Liste.Auto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mape {

    public static void main(String[] args) {
         /*Map<Integer, String> fruits  = new HashMap<>();

        fruits.put(1, "Banana");
        fruits.put(5, "Jabuka");

        System.out.println(fruits);
        System.out.println(fruits.get(5));
       // fruits.remove(1);

        System.out.println(fruits);

        System.out.println("Ključevi:");
        for (Integer k : fruits.keySet()){
            System.out.println(k);
        }
        System.out.println("Vrijednosti:");
        for (String voce : fruits.values()) {
            System.out.println(voce);
        }
        System.out.println("Ključ / Vrijednost");
        for (var entry : fruits.entrySet() ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(fruits); */

        Map<String, Auto> auti = new HashMap<>();

        Auto kia = new Auto("Kia", 2008);
        Auto dacia = new Auto("Dacia", 2020);

        auti.put("Kia", kia);
        auti.put("Dacia", dacia);

        System.out.println(auti);

        for (String s : auti.keySet()){
            System.out.println("Ključ:" + s);
            System.out.print("Ime:" + auti.get(s).getName() + " Godina: " + auti.get(s).getYear() + "\n");
        }
    }
}
