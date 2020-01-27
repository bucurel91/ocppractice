package OCP.a5datesstringsandlocalization.internationalization_and_localization;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
    US // can have a language without a country, but not the reverse
    enUS // missing underscore
    US_en // the country and language are reversed
    EN // language must be lowercase
*/

public class Localization {


    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println( new Locale("RO"));
        System.out.println(new Locale("RO", "ro"));

        Locale locale1 = new Locale.Builder()
            .setLanguage("en") //parametru poate sa fie si cu majuscule si cu minuscule, metodele de set le seteaza corect in interior
            .setRegion("us")
            .build();
        System.out.println(locale1);

        List<String> list = new ArrayList<>();

        list.add("ds");
        list.add("dsa");
        list.clear();
int x = 0;
int z = 10;
        for (int i = 0; i < 3; i++)
            z--; x++;

        System.out.println( z + " " + x);

        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };

        System.out.println( a [ (a = b)[3] ] );

    }
}
