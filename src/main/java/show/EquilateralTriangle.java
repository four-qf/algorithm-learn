package show;

/**
 * @author qiux
 * @Date 2022/2/20
 * @since 等边三角形
 */
public class EquilateralTriangle {

    public static void main(String[] args) {
        int max = 5;
        for(int i=1; i<=max; i++) {
          for (int j = 0; j <= max+i -1; j++) {
              if (j <= (max - i)) {
                  System.out.printf(" ");
              } else {
                  System.out.printf("*");
              }
          }
            System.out.println();
        }
    }

}
