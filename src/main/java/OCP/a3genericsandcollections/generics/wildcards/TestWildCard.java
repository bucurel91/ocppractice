package OCP.a3genericsandcollections.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class TestWildCard {

    public static void main(String[] args) {

        List<? extends Bird> birds = new ArrayList<>();
//       birds.add(new Bird());
//       birds.add(new Sparrow()); //Both does not compile

        List<Flyer>
            flyers =
            new ArrayList<>(); // aici se compileaza, deoarece Flyer este interfata fixa, si in lista data putem adauga orce care implimenteaza interfata data.
        flyers.add(new Goose());
        flyers.add(new HangGlider());

        List<? extends Flyer> flyers1 = new ArrayList<>();
//        flyers1.add(new Goose());                       //Nu se compileaza deoarece lista nu stie exact ce tip o sa fie adaugat in lista, Goose sau HangGlider, astfel se fac                                                                                            metode ptr a transmite orce tip fix de date ca mai jos;

        List<Goose> geese = new ArrayList<>();
        groupOfFlyers(geese); //  iata asa folosim wileCard, in meroda ptr a transmite orce tip de date care extinde Bird

        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> object = new ArrayList<>(strings);
        addSound(object);
        addSound(strings);

    }

    private static void anyFlyer(List<? super Flyer> flyer) {
    }

    private static void groupOfFlyers(List<? extends Flyer> flyer) {
    } //  iata asa folosim wileCard, in meroda ptr a transmite orce tip de date care extinde Bird

    public static void addSound(List<? super String> list) { // lower bound
        list.add("quack");
    }
}
