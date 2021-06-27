package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 18:38
 */
public class ThreadDemo22 {
    public static void main(String[] args) {
        //打印所有得线程
        for (Thread.State item: Thread.State.values()) {
            System.out.println(item);

        }
    }
}
