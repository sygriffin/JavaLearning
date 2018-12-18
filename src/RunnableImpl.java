/**
 * Created by songyang on 2018/12/18.
 */
public class RunnableImpl implements Runnable {


    @Override
    public void run() {
        for (int i = 0;i < 100; i++){
            System.out.println("runnable --> " + i);
            if (i == 50){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
