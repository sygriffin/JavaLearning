package trimmer;

/**
 * Created by songyang on 2018/12/15.
 */
public class AWorker implements Worker {

    private Worker worker;

    public AWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doSomeWork() {
        System.out.println("你好");
        worker.doSomeWork();
    }
}
