/**
 * Created by songyang on 2018/12/13.
 */


//工厂方法

public class PrinterFactory {

    public static AllPrinter getPrinter(int flag) {

        AllPrinter printer = null;

        if(flag == 0) {
            printer = new HPPrinter();
        } else if(flag == 1) {
            printer = new CannonPrinter();
        } else if(flag == 2) {
//            printer = (AllPrinter) new Printer();
        }

        return printer;
    }

}
