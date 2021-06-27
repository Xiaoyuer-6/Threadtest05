package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 18:46
 */
public class ThreadDemo23 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("没调start之前状态:"+t1.getState());
        t1.start();
        System.out.println("调start之后状态:"+t1.getState());
        Thread.sleep(100);
        System.out.println("t1的状态:"+t1.getState());
        //等待程序执行完成
        t1.join();
//        while (!t1.isAlive()){
//
//        }
        System.out.println("线程执行完成之后状态:"+t1.getState());
    }
}
