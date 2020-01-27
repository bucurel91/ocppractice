package OCP.a2designpatternsandprinciples.patterns.immutableobjects;

import java.util.ArrayList;
import java.util.List;

/*
Strategie de creare a obiectelor imutabile
    1. Se foloseste constructorul pentru a seta toate proprietatile obiectului.
    2. Se marcheaza toate variabilele de instanta private si finale.
    3. Nu se definesc setteri.
    4. Sa nu permitem obiectelor de referinta mutabile sa fie modificate sau accesate direct.
    5. Prevenirea de rescriere(override) a metodelor.

 */
public class AnimalImmutable {

    private final String species;
    private final int age;
    private final List<String> favoriteFoods; // este declarata finala, insa continutul la lista poate fi schimbat, respectiv se incalca regula 4

    public AnimalImmutable(int age, String species, List<String> favoriteFoods){
        this.age = age;
        this.species = species;
        if(favoriteFoods == null){
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

//    public List<String> getFavoriteFoods(){// deaceea, ca sa respectam regula 4, metodata data nu trebuie sa fie declarata!!!! ca sa nu putem sa modificam lista dinafara
//        return favoriteFoods;
//    }

    public int getFavoriteFoodsCount(){ //numaru de elemente din lista;
        return favoriteFoods.size();
    }

    public String getFavoriteFood(int index){
        return favoriteFoods.get(index);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}
