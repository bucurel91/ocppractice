package OCPPractice.hConcurrency;


//O varianta de a defini un task ptr ca instanta Thread s-o execute este de a extinde clasa thread si rescrierea metodei run();

public class ExtendsThread extends Thread {

    public void run(){
        System.out.println("Printing something");
    }

    public static void main(String[] args) {
        new ExtendsThread().start();
    }
}
