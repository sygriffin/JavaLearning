class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        //单个字符常量 -- 注意，字符不能为空
        System.out.println('1');
        
        // 进制转换 -- 0b,0, ,0x
        // System.out.println(0b0100);
        // System.out.println(0100);
        // System.out.println(100);
        // System.out.println(0x100);

        Integer temp = 18;
        System.out.println(Integer.toBinaryString(temp));
        System.out.println(Integer.toHexString(temp));
        System.out.println(Integer.toOctalString(temp));
        
        //正数的原反补码都一致，负数反码 -- 除符号位取反，负数补码 -- 在其反码位加一

        //关于隐式转换
        int x = 3;
        byte y = 4;
        int sum = x + y;//系统会帮助你补全高位
        System.out.println(sum);

        //精度的损失与强制类型转换

        y = (byte)(x + y);
        System.out.println(y);

        byte b1 = 3;
        byte b2 = 4;
        byte b3 = (byte)(b1 + b2);//精度缺失问题 -- 运算时会被提升为int -- 变量存储，编译时无法判断具体值类型 -- 而常量，不存在这一点
        byte b4 = 3 + 4;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        //float比long的取值范围要大

        //ASCII码
        System.out.println('a' + 1);
        System.out.println((char)('a' + 1));
        //任何数据类型与字符串相连接，都会产生新的字符串

        //char是否可以存储中文
        char chinese = '中';
        System.out.println(chinese);

        //任何运算符都要注意，底层是否会将变量类型进行提升，以防损失精度
        


    }
}

