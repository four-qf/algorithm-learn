package show;

/**
 * @author qiux
 * @Date 2022/2/20
 * @since
 */
public class Haskell {
    public static void main(String[] args) {
        for(int i=1; i<=9;i++) {
            for (int j = 1; j<=i; j++) {
                System.out.printf(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}
