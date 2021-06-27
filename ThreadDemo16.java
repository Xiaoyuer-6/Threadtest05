package threadz_0627;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 16:40
 */
public class ThreadDemo16 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("当前线程名称："+Thread.currentThread().getName());
        },"张三");
        thread.start();
        //thread.run();
    }
}
