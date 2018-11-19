import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        int age = 10;
        age += 10;
        System.out.println(age);

        char c = '中';

        System.out.println(c);


        boolean compare = false;
        System.out.println(compare);
        compare = true;
        System.out.println(compare);
        if (compare) {
            System.out.println(1);
        } else  {
            System.out.println(0);
        }

//        String astr = "你好，";
//        String bStr = "Java";

        String cStr = "JAVA" + "Hello";
        System.out.println(cStr);

        int i = 5;
        int j = 5;
        int k = i++ + j;
        i = 5;
        j = 5;
        int l = ++i + j;
        System.out.println(k);
        System.out.println(l);

        STATUS status;
        int result = 74;
        if (result >= 0 && result < 60){
            status = STATUS.STATUS_cha;
            System.out.println(status);
        } else if (result >= 60 && result < 70){
            status = STATUS.STATUS_zhong;
            System.out.println(status);
        } else if (result >= 70 && result < 85){
            status = STATUS.STATUS_liang;
            System.out.println(status);
        } else if (result >= 85 && result < 100){
            status = STATUS.STATUS_you;
            System.out.println(status);
        } else {

        }





    }

    public enum STATUS {
        STATUS_you,STATUS_liang,STATUS_zhong,STATUS_cha
    }



}
