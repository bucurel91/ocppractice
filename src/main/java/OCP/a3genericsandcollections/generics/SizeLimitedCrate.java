package OCP.a3genericsandcollections.generics;

public class SizeLimitedCrate<T, U> {

    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit){
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }

    public <V> void print(V t){

    }
    public <V> V print (V v, int x){
        return  v;
    }

//    public V  print (V v, int x){   //does not compile
//        return  v;
//    }

    /*
    Putem face in felu urmator

    Elephant elephant = new Elephant();
    Integer pounds = 15_000;
    SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);

     */
}
