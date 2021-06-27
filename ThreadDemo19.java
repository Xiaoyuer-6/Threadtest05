package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 17:32
 */
//线程中断
public class ThreadDemo19 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
              while (!Thread.interrupted()){
                  System.out.println("正在转账");
              }
                System.out.println("终止转账");
            }
        });
        t1.start();
        Thread.sleep(10);
        System.out.println("停止交易");
        t1.interrupt();
    }
}
