package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 18:29
 */
public class ThreadDemo21 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"上班");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"下班");
            }
        };
        Thread t1  = new Thread(runnable,"yiyi");
        t1.start();
        Thread t2 = new Thread(runnable,"erer");
        t1.join();
        t2.start();
    }
}
