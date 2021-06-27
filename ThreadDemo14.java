package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 14:01
 * 优先级演示
 */
public class ThreadDemo14 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名"+Thread.currentThread().getName());
            }
        };
        for (int i = 0; i <10 ; i++) {
            //定义了一个方法
            Thread t1  = new Thread(runnable,"一一");
            Thread t2 = new Thread(runnable,"lisa");
            Thread t3 = new Thread(runnable,"噢噢");
            t1.setPriority(1);//
            t3.setPriority(10);
            t1.start();
            t2.start();
            t3.start();

        }
    }
}
