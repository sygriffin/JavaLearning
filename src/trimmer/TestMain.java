package trimmer;

import java.util.Scanner;

/**
 * Created by songyang on 2018/12/15.
 */
public class TestMain {

    public static void main(String args[]) {

        Plumber plumber = new Plumber();
        AWorker aWorker = new AWorker(plumber);

        aWorker.doSomeWork();

        Carpenter carpenter = new Carpenter();
        AWorker aWorker1 = new AWorker(carpenter);

        aWorker1.doSomeWork();



    }
}
