/**
 * Created by songyang on 2018/12/18.
 */
public class RunnableImpl implements Runnable {


    public int ii = 100;

    @Override
    public void run() {
//        for (int i = 0;i < 100; i++){
//            System.out.println("runnable --> " + i);
//            if (i == 50){
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        //同步锁 -- 同步代码块


        while(true) {
            synchronized(this) {
                if (ii < 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ii);
                ii--;
                Thread.yield();

            }
            //会出问题 --
        }

    }
}
