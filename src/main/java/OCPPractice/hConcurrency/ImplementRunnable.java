package OCPPractice.hConcurrency;

//Alta varianta de a defini un task ptr ca instanta Thread s-o execute este de a impliemta interfata Runnable ;

public class ImplementRunnable implements Runnable{

    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing record: " + "i");
        }
    }

    public static void main(String[] args) {
        new Thread(new ImplementRunnable()).start();
    }
}
