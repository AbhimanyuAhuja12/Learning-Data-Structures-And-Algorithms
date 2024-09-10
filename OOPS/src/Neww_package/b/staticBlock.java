package Neww_package.b;

public class staticBlock {
    static int a=5;
    static int b;

    static{ // only called once when the class is loaded for first time
//        When a class is loaded by the JVM, static blocks are executed automatically as part of the
//        class initialization process. This occurs regardless of whether you create an instance of
//        the class or not.
//        The JVM ensures that static blocks are executed once when the class is first loaded.
        System.out.println("In Static Block");
        b=a*3;
    }

    public static void main(String[] args) {
        System.out.println(staticBlock.a);
        System.out.println(staticBlock.b);
    }
}
