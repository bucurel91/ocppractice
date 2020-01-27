package OCPPractice.dfunctionalProgramming.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CommonIntermediateOperations {


    public static void main(String[] args) {

        //    The filter() method returns a Stream with elements that match a given expression. Here
        //    is the method signature:
        //    Stream<T> filter(Predicate<? super T> predicate)
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.filter(x -> x.startsWith("1")).forEach(System.out::println);

        System.out.println("////////////////////////////////////////////////////////////////");


//        The distinct() method returns a stream with duplicate values removed. The duplicates do
//            not need to be adjacent to be removed. As you might imagine, Java calls equals() to determine
//        whether the objects are the same. The method signature is as follows:

        //Stream<T> distinct()

        Stream<String > s = Stream.of("bun", "bun", "shmai bun");
        s.distinct().forEach(System.out::println);

        System.out.println("////////////////////////////////////////////////////////////////");

//        The limit() and skip() methods make a Stream smaller. They could make a finite stream
//        smaller, or they could make a finite stream out of an infinite stream. The method signatures
//        are shown here:

//        Stream<T> limit(int maxSize)
//        Stream<T> skip(int n)

        Stream<Integer> s1 = Stream.iterate(1, n -> n + 1);
        s1.skip(5).limit(2).forEach(System.out::println);

        System.out.println("////////////////////////////////////////////////////////////////");

//        The map() method creates a one-to-one mapping from the elements in the stream to the elements
//        of the next step in the stream. The method signature is as follows:

//        <R> Stream<R> map(Function<? super T, ? extends R> mapper)


//        As an example, this code converts a list of String objects to a list of Integer s representing
//        their lengths:

        Stream<String> s2 = Stream.of("primu", "aldoilea", "altreilea");
        s2.map(String::length).forEach(System.out::print);
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////");

//        The flatMap() method takes each element in the stream and makes any elements it contains
//        top-level elements in a single stream. This is helpful when you want to remove empty
//        elements from a stream or you want to combine a stream of lists. We are showing you the
//        method signature for consistency with the other methods, just so you don’t think we are
//        hiding anything. You aren’t expected to be able to read this:
//        <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Bununu", "benebe");

        Stream<List<String >> stream1 = Stream.of(zero, one, two);

        stream1.flatMap(l -> l.stream()).forEach(System.out::print);

        System.out.println("////////////////////////////////////////////////////////////////");

//        The sorted() method returns a stream with the elements sorted. Just like sorting arrays,
//        Java uses natural ordering unless we specify a comparator. The method signatures are
//        these:
//        Stream<T> sorted()
//        Stream<T> sorted(Comparator<? super T> comparator)

        Stream<String> s4 = Stream.of("brown-", "bear-");
        s4.sorted().forEach(System.out::print);
        System.out.println();

        Stream<String> s5 = Stream.of("brown-", "bear-", "grizzly-");
        s5.sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        System.out.println("////////////////////////////////////////////////////////////////");

//        The peek() method is our final intermediate operation. It is useful for debugging because it
//        allows us to perform a stream operation without actually changing the stream. The method
//        signature is as follows:
//        Stream<T> peek(Consumer<? super T> action)

        Stream<String> stream2 = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream2.filter(d -> d.startsWith("g")).peek(System.out::println).count();
        System.out.println(count);
    }
}
