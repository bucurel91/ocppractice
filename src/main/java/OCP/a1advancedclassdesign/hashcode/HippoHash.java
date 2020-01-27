package OCP.a1advancedclassdesign.hashcode;

import java.util.Objects;

public class HippoHash {

    private String name;
    private int weigth;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HippoHash hippoHash = (HippoHash) o;
        return weigth == hippoHash.weigth &&
            name.equals(hippoHash.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weigth);
    }
}
