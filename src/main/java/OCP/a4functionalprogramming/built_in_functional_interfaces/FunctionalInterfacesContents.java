package OCP.a4functionalprogramming.built_in_functional_interfaces;


public interface FunctionalInterfacesContents {

    /*

    - Supplier<T>         - nu primeste nici un parametru,   returneaza T,       metoda T get()

    - Consumer<T>         - primeste un parametru T,         returneaza void,    metoda  void accept(T t)

    - BiConsumer<T, U>    - primeste 2 parametri T, U        returneaza void     metoda void accept(T t, U u)

    - Predicate<T>        - primeste un parametru T          returneaza boolean  metoda boolean test(T t)

    - BiPredicate<T,U>    - primeste 2 parametri T,U         returneaza boolean  metoda boolean test(T t, U u)

    - Function<T, R>      - primeste un parametru T          returneaza R        metoda R apply(T t)

    - BiFunction<T, U, R> - primeste 2 parametru T,U         returneaza R        metoda R apply(T t, U u)

    - UnaryOperator<T>    - primeste un parametru T          returneaza T        metoda T apply(T t)  extinde Interfata Function, foloseste metoda ei

    - BinaryOperator<T>   - primeste 2 parametri T T         returneaza T        metoda T apply (T t, T t) extinde Interfata BiFunction, foloseste metoda ei

    */

}
