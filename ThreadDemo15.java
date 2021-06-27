package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 14:39
 */
public class ThreadDemo15 {
    public static void main(String[] args) {
        Thread t1  = new Thread(()->{
            ;
            for (int i = 0; i <10 ; i++) {
                System.out.println("i:" +i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        t1.setDaemon(true);
        t1.start();
        //t1.setDaemon(true);
        System.out.println("t1是否是守护线程"+t1.isDaemon());
    }
}
