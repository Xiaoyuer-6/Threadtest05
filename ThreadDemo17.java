package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 16:53
 */
public class ThreadDemo17 {
    //全局自定义得变量
    private static boolean flag = false;
    public static void main(String[] args) throws InterruptedException {
       Thread t1  = new Thread(new Runnable() {
           @Override
           public void run() {
               while (!flag ){
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("正在转账");
               }
               System.out.println("转账终止");
           }
       });
       t1.start();
       Thread t2  = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(310);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("停止交易");
               flag = true;
           }
       });
       t2.start();

       t1.join();
       t2.join();

    }


}
