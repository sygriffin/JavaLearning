/**
 * JavaMethod
 */
public class JavaMethod {

    public static void main(String[] args) {
        
        Integer result = firstMethod(1,2); 
        float result2 = firstMethod(1, 2, 3);
        System.out.println(result);
        System.out.println(result2);
    }


    public static Integer firstMethod(int a, int b) {
        return a+b;
    }



    //方法重载 -- 方法名相同，参数列表不同，参数类型也可不同
    public static float firstMethod(int a, int b, int c) {
        return a+b+c;
    }

    

    
    
}


