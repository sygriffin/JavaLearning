/**
 * Created by songyang on 2018/12/18.
 */
public class FirstThread extends Thread {

    public void run(){
        for (int i = 0; i<100;i++) {
            System.out.println("1Thread --> "+i);
        }
    }

}
