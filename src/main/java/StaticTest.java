/**
 * @author qiux
 * @Date 2022/2/20
 * @since
 */
public class StaticTest {

    private static int b = 9;

    public StaticTest() {
        System.out.println("main constructor");
    }


    static {
        System.out.println("static main 1");
    }

    public static void test() {
        count = 3;
        System.out.println("static main 2");
    }

    {
        System.out.println("main 3");

    }

    private static int count = 1;

    public static void main(String[] args) {
//        StaticTest staticTest = new StaticTest();
//        test();
//        System.out.println("count:" + count);
//        System.out.println(Test.b);

        Test[] staticTests = new Test[10];

    }

}

class Test extends SuperTest {

    static int b = 20;

    static {
        System.out.println(" static test 1");
    }

    {
        System.out.println("test 3");
    }

    public Test() {
        System.out.println("test 2");
    }
}


class SuperTest{

    static int a =10;

    public SuperTest() {
        System.out.println("StaticSuperTest");
    }

    static {
        System.out.println("super static 1");
    }

    public static void test() {
        System.out.println("super static 2");
    }

    {
        System.out.println("super 3");
    }
}
