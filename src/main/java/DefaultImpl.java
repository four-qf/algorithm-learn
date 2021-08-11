import java.lang.reflect.Field;

/**
 * @author qiuxian
 * @date 2021/6/28
 */
public class DefaultImpl implements DefaultA, DefaultB {

    private String name;

    @Override
    public void save() {
        System.out.println("save default");
    }

    public static void main(String[] args) throws IllegalAccessException {
//        DefaultA defaultA = new DefaultImpl();
//        defaultA.save();

        DefaultImpl o = new DefaultImpl();
        Field[] declaredFields = o.getClass().getDeclaredFields();
        System.out.println(declaredFields[0].getName());


    }

}
