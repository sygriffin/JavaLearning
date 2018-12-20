import java.util.*;

/**
 * Created by songyang on 2018/12/19.
 */
public class Array {

    public static void main(String[] args) {

        //数组的静态声明
        int arr[] = {1, 2, 3, 2, 8, 6};

        //基本数据类型
        //引用数据类型

        arr[3] = 10;
        System.out.println(arr.length);
        System.out.println(arr[3]);

        //
        int arr1[] = new int[10];

        //声明字符数组
        char arrChar[] = new char[10];

        //定义二维数组
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(arr2[0][1]);

//        arr.hashCode();

        //类集框架

        //类集框架是一组类和接口，位于java.util，主要用户存储和管理对象

        //主要分为三大类-集合、列表、映射

        //集合 Set -- 对比NSSet

        //列表 List -- TableView -- ListView

        //映射 Map -- 键值对 Key-Value -- 对比NSDictionary

        ArrayList<String> arrayList = new ArrayList<String>();

        //长度无限延伸 -- 动态开辟的  --  <泛型> -- 只能存储该类型

        arrayList.add("a");
        arrayList.add("b");
//        String arrStr [] = {"1","2","3"};

        System.out.println(arrayList.get(0));

        System.out.println(arrayList.size());

        arrayList.remove(1);

        //Collection接口 -- 集合（TableView -- CollectionView）&& Set hashSet


        HashSet<String> hashSet = new HashSet<String>();

        Set<String> set = hashSet;

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");

        System.out.println(set.size());

        //set.clear();


        //Iterator -- 迭代器

        //Iterator <-- Collection <-- Set <-- HashSet

        //会生成一个迭代器对象 -- 用于遍历整个set
        Iterator<String> iterator = set.iterator();

//        iterator.hasNext();   // -- 是否还有下一个元素
        boolean bool = iterator.hasNext();

        if (bool) {
            String s = (String) iterator.next();
            System.out.println(s);
        }















    }


}