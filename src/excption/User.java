package excption;

/**
 * Created by songyang on 2018/12/13.
 */
public class User {
    private int age;

    //throws -- 声明一个异常

    public void setAge(int age) throws Exception {
//        if (age < 0){
//            RuntimeException e = new RuntimeException("年龄不能为负数");
//            throw e;
//        }

        //此时为checkException
        if (age < 0){
            Exception e = new Exception("年龄不能为负数");
            throw e;
        }

        this.age = age;
    }


}
