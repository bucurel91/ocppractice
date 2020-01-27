package OCPPractice.fLocalizationInternationalization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleProp {

    public static void main(String[] args) throws IOException {

        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");

        printProperties(us);
        System.out.println();
        printProperties(france);
      try(FileInputStream fi = new FileInputStream("")){
          System.out.println();
      }
    }

    public static void printProperties(Locale locale){

        ResourceBundle rb = ResourceBundle.getBundle("zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }
}
