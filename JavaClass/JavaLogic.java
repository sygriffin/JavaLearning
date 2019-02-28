import java.util.Scanner;

class JavaLogic {

    public static void main(String[] args) {
        
        System.out.println(5^10^10);

        System.out.println(5^10^5);

        int x = 10;
        int y = 5;

        //用异或运算交换x与y的值
        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println(x);
        System.out.println(y);

        //位运算 -- 高效的运算方式
        //<<左移 -- >>右移 左移几位就是乘以2的几次幂，右移就是除以2的几次幂
        System.out.println(2 << 3);
        //三目运算符
        System.out.println(x>y? x : y);

        //像C语言一样的scanf
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int inputNum = sc.nextInt();
        System.out.println(inputNum);
        // sc.close();
        
        

    }
}