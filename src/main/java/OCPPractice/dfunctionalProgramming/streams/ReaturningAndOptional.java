package OCPPractice.dfunctionalProgramming.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class ReaturningAndOptional {

    //Common terminal Operations

    public static void main(String[] args) {


//        The reduce() method combines a stream into a single object. As you can tell from the
//        name, it is a reduction.


        Stream<String> stream = Stream.of("1", "2", "3");
        Stream<String> stream2 = Stream.of("1", "2", "3");
        Stream<Integer> stream1 = Stream.of(2,3,4);

        Optional<Integer> nr = stream1.reduce( (x, y) -> x*y);
        String d = stream.reduce("",String::concat);
        String a = stream2.reduce("", (s,r )-> s + r);

        System.out.println(nr);

        System.out.println(d + " " + a );

        //The collect() method is a special type of reduction called a mutable reduction. It is
        //more efficient than a regular reduction because we use the same mutable object while accumulating. Common mutable objects include StringBuilder and ArrayList. This is a
        //really useful method, because it lets us get data out of streams and into another form.

        Stream<String> s = Stream.of("w", "o", "l", "f");
        StringBuilder sb = s.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(sb.toString());
    }
}
