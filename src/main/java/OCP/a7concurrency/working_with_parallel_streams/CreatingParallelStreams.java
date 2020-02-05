package OCP.a7concurrency.working_with_parallel_streams;


import java.util.Arrays;

public class CreatingParallelStreams {

    public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5, 6).stream().forEach(System.out:: print);

        System.out.println("");

        Arrays.asList(1,2,3,4,5,6).stream().parallel().forEach(System.out:: print);// in cazult dat sout se executa de streamuri paralele, astfel rezultatul nu va mai fi ordonat

        System.out.println("");

        Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(System.out:: print);// same shit ca sus
        System.out.println("");

        //Exista o metoda care ordoneaza rezultatul, dar scade performanta

        Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(System.out:: print);
    }
}
