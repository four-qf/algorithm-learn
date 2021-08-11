/**
 * @author qiuxian
 * @date 2021/7/13
 */
public class SortThread {

    public static void main(String[] args) throws InterruptedException {

        SortThread sortThread = new SortThread();

        sortThread.printA();
        sortThread.printA();
        sortThread.printA();


    }

    private void printA() throws InterruptedException {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {

                    if (i % 3 == 0) {
                        System.out.print("a");
                    }
                    if (i % 3 == 1) {
                        System.out.print("l");

                    }
                    if (i % 3 == 2) {
                        System.out.print("i");
                    }
                }
                System.out.println();

            }
        });

        thread.start();


    }



}
