package OCP.a4functionalprogramming.returningOptional;

import java.util.Optional;
import javax.swing.text.html.Option;

public class ReturningOptional {


    /*

    Optional - interfata prin intermediul careia putem exprima daca putem sa calucalm media ceva sau nu, este cazul cind nu sunt date deloc,
    astfel nu avem cum sa calculam media, respectiv interfata data ne returneaza ca nu sunt date, si  metoda nu cade.

    Putem sa verificam daca  Optional contine valoare sau este goala.

    */


    public static Optional<Double> average(int ... scores){

        if(scores.length == 0) return Optional.empty();
        int sum = 0;

        for (int score : scores){
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {

        System.out.println(average(1,3,5));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }

        Optional<Double> opt1 = average();
       // System.out.println(opt1.get());

        Optional o = (opt1.get() == null)? Optional.empty() : Optional.of(opt1.get());
        System.out.println(o);

        Optional o1 = Optional.ofNullable(opt1.get());


    }
}
