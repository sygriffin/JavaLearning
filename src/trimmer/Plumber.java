package trimmer;

/**
 * Created by songyang on 2018/12/15.
 */
public class Plumber implements Worker {
    @Override
    public void doSomeWork() {
        System.out.println("修水管");
    }
}
