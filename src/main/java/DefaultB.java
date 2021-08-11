/**
 * @author qiuxian
 * @date 2021/6/28
 */
public interface DefaultB {

    default void  save() {
        System.out.println("A");
    }

}
