package OCPPractice.advancedClassDesign.toStringEqualsHashCode;

import java.util.Objects;

public class Hypo extends HeavyAnimal {

    private String name;
    private int heigh;

    public Hypo(String name, int heigh) {
        this.name = name;
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return "Hypo{" +
            "name='" + name + '\'' +
            ", heigh=" + heigh +
            '}';
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Hypo)) return false;
        Hypo hip = (Hypo) obj;
        return this.name == hip.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heigh);
    }
}
