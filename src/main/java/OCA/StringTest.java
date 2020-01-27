package OCA;

public class

StringTest {

    static String str = "Jmotearadsa3";

    public static void main(String[] args) {

//        System.out.println(str.substring(3));
//        System.out.print(":");
//        System.out.print(str.trim());
//        System.out.println(":");
//
//        System.out.println(str.substring(3).startsWith("m"));
//
//        System.out.println(str.charAt(2));
//
//        System.out.println(str.indexOf("a",2));

        StringBuilder sb = new StringBuilder("Igor");

        System.out.println(sb.append('a'));
        //System.out.println(sb.insert(5,sb ,0,4));

        System.out.println(sb.reverse());
        System.out.println(sb.replace(2,4,"YO"));

        sb.setLength(2);
        sb.setLength(10);

        System.out.println(sb.length());

    }
}
