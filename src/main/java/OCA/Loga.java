package OCA;

public class Loga {

    public static boolean metoda(int num) {

        boolean result = false;

        if ((num % 2) != 0) {
            return false;
        } else{
            while (num % 2 == 0) {
                if (num == 2) {
                    result = true;
                }
                num/=2;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(metoda(128));

    }
}