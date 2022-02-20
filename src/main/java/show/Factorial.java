package show;

/**
 * @author qiux
 * @Date 2022/2/20
 * @since
 */
public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        int result = num;
        for(int i = num-1; i > 0; i--) {
            result = result * i;
            System.out.println("i:" + i);
        }
        System.out.println(result);
    }

}
