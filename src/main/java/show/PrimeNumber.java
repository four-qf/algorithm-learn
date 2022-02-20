package show;

/**
 * @author qiux
 * @Date 2022/2/20
 * @since
 */
public class PrimeNumber {

    public static void calPrime(int start, int end) {
        outer:for (int i = start; i<=end; i++ ) {
            int count =0;
            inner:for(int j= 2; j <= (i/2 +1) ; j++) {
                if (i % j == 0 && i>j) {
                    count =1;
                    break inner;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        calPrime(20,100);
    }

}
