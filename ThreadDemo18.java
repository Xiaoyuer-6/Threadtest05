package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 17:14
 */
//使用interrupt进行终止线程
public class ThreadDemo18 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.interrupted()){//判断线程得终止状态
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                    System.out.println("正在转账");
                }
                System.out.println("终止转账");
            }
        });
        t1.start();
        //main线程
        Thread.sleep(310);
        System.out.println("终止交易");
        t1.interrupt();//终止线程

    }
}
