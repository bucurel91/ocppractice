package OCPPractice.dfunctionalProgramming.streams;

import java.util.stream.Stream;

public class WorkingWithPrimitives {

    public static void main(String[] args) {

        Stream<Integer> s = Stream.of(1, 2, 3);
        System.out.println(s.reduce(0,(x,y) -> x + y));

    }
}
