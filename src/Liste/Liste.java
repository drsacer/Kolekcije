package Liste;

import java.util.ArrayList;
import java.util.List;

public class Liste {

    public static void main(String[] args) {

        /*
        List<String> ime = List.of();
        List <Integer> brojevi = List.of(100, 50);
        List <String> voce = List.of("Banana","Jabuka", "Kruska");

        //ime.add("Java");

        System.out.println(brojevi.get(0));
        System.out.println(brojevi.size());

        System.out.println(voce.get(2));

        for (int i = 0; i < voce.size(); i++) {
            System.out.println(voce.get(i));
        }

        for (String s: voce) {
            System.out.println(s);
        }

        List<String> jezici = new ArrayList<>();
        jezici.add("Java");
        jezici.add("Python");

        System.out.println();

        System.out.println("Jezici:");
        for (String jezik : jezici ) {
            System.out.println(jezik);
        }

        jezici.add("Javascript");
        System.out.println(jezici);

        jezici.set(0, "C++");
        System.out.println(jezici); */

        List<Auto> auti = new ArrayList<>();

        Auto kia = new Auto("Kia", 2008);
        Auto dacia = new Auto("Dacia", 2020);

        auti.add(kia);
        auti.add(dacia);

        System.out.println(auti);
        System.out.println(auti.get(0));
        System.out.println(auti.get(0).getName() + " "  + auti.get(0).getYear());

        System.out.println();

        for (Auto a : auti) {
            System.out.println(a.getName());
            System.out.println(a.getYear());
        }
        System.out.println();

        auti.remove(dacia);
        for (Auto a : auti) {
            System.out.println(a.getName());
            System.out.println(a.getYear());
        }

        System.out.println("KRAJ");
        System.out.println(auti);
    }
}
