package OCP.a4functionalprogramming.usingstreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalWithPrimitiveStreams {


    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1, 10);
        OptionalDouble optionalDouble = intStream.average();

        optionalDouble.ifPresent(System.out:: println);
        System.out.println(optionalDouble.getAsDouble());
        System.out.println(optionalDouble.orElseGet(() -> Double.NaN));

    }

}
