package OCP.a1advancedclassdesign.tostring;

import io.micrometer.core.lang.NonNull;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Objects;

public class Hippo {

    String name;
    int weigth;

    public Hippo(String name, int weigth) {
        this.name = name;
        this.weigth = weigth;
    }

//    @Override
//    public String toString(){
//        return "Name: " + name + " has weigth " + weigth;
//    }

//    public boolean equals(Object o){
//        return EqualsBuilder.reflectionEquals(this, o);
//    }

    public boolean equals(Object o) {

        if (!(o instanceof Hippo)) {
            return false;
        }
        Hippo otherHippo = (Hippo) o;
        return this.name.equals(otherHippo.name) && this.weigth == otherHippo.weigth;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weigth);
    }
}
