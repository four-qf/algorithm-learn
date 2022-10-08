package violence_recursion;

/**
 * @author qiux
 * @Date 2022/10/8
 * @since  有一个1*N的棋盘，将棋子放置到棋盘的M位置，使其走K步能到达棋盘的P位置
 */
public class StepMethodSumCache {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        int n = 7;
        int m = 2;
        int k = 5;
        int p = 3;
        if (n < m || m <1 || k <1 || p <1 || p>n) {
            System.out.println(0);
            return;
        }
        int[][] stepNum = new int[n+1][k+1];
        for (int i=0; i <=n; i++) {
            for (int j = 0; j <= k; j++) {
                stepNum[i][j] = -1;
            }
        }
        int stepNumSum = process(n, m, k, p, stepNum);
        System.out.println(stepNumSum);
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);

    }

    public static int process(int n, int m, int k, int p, int[][] step) {
        if (step[m][k] != -1) {
            return step[m][k];
        }
        if (k==0) {
            step[m][k] = m == p ? 1 : 0;
            return step[m][k];
        }
        if (m == 1) {
            step[m][k] = process(n, 2, k - 1 , p, step);
            return step[m][k];
        }
        if (m == n) {
            step[m][k] = process(n, m-1, k - 1, p, step);
            return step[m][k];
        }

        step[m][k] = process(n, m +1, k-1, p, step) + process(n, m -1, k -1, p, step);
        return step[m][k];
    }

}
