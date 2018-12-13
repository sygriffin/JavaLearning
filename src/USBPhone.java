/**
 * Created by songyang on 2018/12/13.
 */

//实现接口

//一个类可以实现多个接口

//一个接口可以继承多个接口


public class USBPhone implements USB,WiFi,Z {


    @Override
    public void USBread() {
        System.out.println("read...");
    }

    @Override
    public void USBwrite() {
        System.out.println("write...");
    }

    @Override
    public void openWifi() {
        System.out.println("open...");
    }

    @Override
    public void closeWifi() {
        System.out.println("close...");
    }

    //引入Z，Z继承于XY，实现XYZ三个方法

    @Override
    public void funX() {

    }

    @Override
    public void funY() {

    }

    @Override
    public void funZ() {

    }
}
