package OCP.a7concurrency.working_with_parallel_streams;

import java.util.ArrayList;
import java.util.List;

public class WhaleDataCalculator {

    public int processRecord(int input){
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println("EXceptie!!");
        }

        return input + 1;
    }

    public void processAllData(List<Integer> data){
        data.parallelStream().map(a -> processRecord(a)).count(); // procesarea datelor cu stream() se face aproximatib 40 sec, cu paralleStream() 5 sec lol!!!
    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();

        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            data.add(i);
        }

        long start = System.currentTimeMillis();
        calculator.processAllData(data);

        double time = (System.currentTimeMillis()-start)/1000.0;

        System.out.println("\nTasks completed in: " + time + " seconds");
    }
}
