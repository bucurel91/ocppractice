package OCP.a5datesstringsandlocalization.internationalization_and_localization;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class FileResourceBundle {

    public static void main(String[] args) {

        Locale us = new Locale("en", "us");
        Locale fr = new Locale("fr", "fr");
        printResourceBundleProperties(fr);
        printResourceBundleProperties(us);

    }

    public static void printResourceBundleProperties(Locale locale){

        ResourceBundle resourceBundle = ResourceBundle.getBundle("zoo", locale);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("open"));

        Set<String> keys = resourceBundle.keySet();

        keys.stream().map(k -> k + " " + resourceBundle.getString(k)).forEach(System.out:: println);

        Properties props = new Properties();
        resourceBundle.keySet().stream().forEach(p -> props.put(p, resourceBundle.getString(p)));

        System.out.println(props.getProperty("open"));
    }
}
