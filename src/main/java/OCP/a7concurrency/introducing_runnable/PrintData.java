package OCP.a7concurrency.introducing_runnable;

public class PrintData implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Print recrod: " + i);
        }
    }

    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
    }
}
