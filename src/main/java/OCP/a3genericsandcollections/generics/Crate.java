package OCP.a3genericsandcollections.generics;


//Sintaxa de introducere a generics este de a declara un tip parametru formal intre paranteze unghiulare
public class Crate<T> {

    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }

    public static void main(String[] args) {


    }
}
