package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 18:00
 */
public class ThreadDemo20 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    //System.out.println(Thread.interrupted());
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        t1.start();
        //终止线程
        t1.interrupt();
    }
}
