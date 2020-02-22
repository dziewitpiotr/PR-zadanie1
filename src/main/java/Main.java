import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String zdanie;
        String wynik;

        Map<String, Integer> mapaSlow = new HashMap<>();


        do {
            System.out.println("Wpisz zdanie do policzenia: ");
            zdanie = scanner.nextLine();
            String[] slowa = zdanie.split(" ");
            System.out.println("Co chcesz zrobic: ");
            System.out.println("1. wynik");
            System.out.println("2. quit");
            wynik = scanner.nextLine();

            if (wynik.equalsIgnoreCase("wynik")) {
                wykonajObliczenia(slowa, mapaSlow);
            }

        } while (!wynik.equalsIgnoreCase("quit"));

    }

    private static void wykonajObliczenia(String[] slowa, Map<String, Integer> map) {

        for (int i = 0; i < slowa.length; i++) {
            if (map.containsKey(slowa[i])) {
                int ilosc = map.get(slowa[i]);
                map.put(slowa[i], ilosc +1);
        } else {
                map.put(slowa[i], 1);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println("Słowo: " + stringIntegerEntry.getKey() + " wystepuje " + stringIntegerEntry.getValue());
        }


    }
}
