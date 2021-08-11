/**
 * @author qiuxian
 * @date 2021/6/28
 */
public interface DefaultA {

    default void  save() {
        System.out.println("A");
    }

}
