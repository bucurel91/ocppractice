package OCPPractice.advancedClassDesign.nestedClasses;

import OCPPractice.advancedClassDesign.nestedClasses.OuterForStaticNestedClass.NestedStaticClass;
import static OCPPractice.advancedClassDesign.nestedClasses.OuterForStaticNestedClass.NestedStaticClass.print;

public class TestImportStaticNestedClass {



    public static void main(String[] args) {
        NestedStaticClass.print();
     print();
    }
}
