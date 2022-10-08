package queenque;

/**
 * @author qiux
 * @Date 2022/10/7
 * @since
 */
public class QueenTry {

    public static void main(String[] args) {

    }

    public static int process(int n) {
        if (n == 1) {
            return 1;
        }
        if (n==2 || n == 3) {
            return 0;
        }
        return 0;
    }

}
