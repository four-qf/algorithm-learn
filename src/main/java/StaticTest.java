/**
 * @author qiux
 * @Date 2022/2/20
 * @since
 */
public class StaticTest {

    static {
        System.out.println("static 1");
    }

    public static void test() {
        count = 3;
        System.out.println("static 2");
    }

    {
        System.out.println("3");

    }

    private static int count = 1;

    public static void main(String[] args) {
//        StaticTest staticTest = new StaticTest();
        test();
        System.out.println("count:" + count);

    }

}