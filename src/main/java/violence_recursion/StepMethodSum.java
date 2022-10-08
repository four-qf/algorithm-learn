package violence_recursion;

/**
 * @author qiux
 * @Date 2022/10/8
 * @since
 * 有一个1*N的棋盘，将棋子放置到棋盘的M位置，使其走K步能到达棋盘的P位置
 *
 */
public class StepMethodSum {

    public static void main(String[] args) {
        int n = 7;
        int m = 2;
        int k = 5;
        int p = 3;
        if (n < m || m <1 || k <1 || p <1 || p>n) {
            System.out.println(0);
            return;
        }
        int stepNum = process(n, m, k, p);
        System.out.println(stepNum);
    }

    public static int process(int n, int m, int k, int p) {
        if (k==0) {
            return m == p ? 1 : 0;
        }
        if (m == 1) {
            return process(n, 2, k - 1 , p);
        }
        if (m == n) {
            return process(n, m-1, k - 1, p);
        }

        return process(n, m +1, k-1, p) + process(n, m -1, k -1 ,p);
    }

}
