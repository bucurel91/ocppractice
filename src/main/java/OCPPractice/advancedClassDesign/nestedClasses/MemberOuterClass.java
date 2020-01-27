package OCPPractice.advancedClassDesign.nestedClasses;

public class MemberOuterClass {

   private String varianila = "hello";
   private String thisword = "this is outer member variable";

   protected class MemberInner {

       public int repeat = 3;

       public void go(){
           for (int i = 0; i < repeat; i++) {
               System.out.println(varianila);
           }

           System.out.println(MemberOuterClass.this.thisword);
           System.out.println(repeat);
           System.out.println(this.repeat);
       }
   }

    public void callInner(){
        MemberInner memberInner = new MemberInner();
        memberInner.go();


   }
    public static void main(String[] args) {
        MemberOuterClass memberOuterClass = new MemberOuterClass();
        memberOuterClass.callInner();

     //   MemberInner m = new MemberInner(); asta nu se poate, deoarece se comporta ca orce membru de instanta,
        //   variabila sau metoda, adic nu poate fi chemata in metoda statica(in cazu nostru metoda main)

        MemberInner memberInner = memberOuterClass.new MemberInner();// din acest motiv clasa inner se instantiata prin intermediul clasei outer, ceia ce e valabil.
        memberInner.go();

        MemberOuterClass.MemberInner  outerr = memberOuterClass.new MemberInner();
        outerr.go();
    }
}
