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

        //Map -- Dictionary

        HashMap<String,String> hashMap = new HashMap<String,String>();

        Map<String,String> map = hashMap;

        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        System.out.println("map size is " + map.size());

        map.get("3");

        //当键值相同时，后面的会把前面的值覆盖 -- 排除原来的


        //isEqual -- ==(基本数据类型为=) (值类型 -- 判断两个引用是否指向同一块堆内存地址)


        EqualUser u1 = new EqualUser();
        EqualUser u2 = new EqualUser();
        EqualUser u3 = u1;
        EqualUser u4 = new EqualUser();

        u1.Ename = "111";
        u1.Eage = 11;
        u2.Ename = "222";
        u2.Eage = 11;
        u4.Ename = "111";
        u4.Eage = 11;


        boolean aaa = u1 == u2;
        boolean bbb = u1 == u3;

        boolean ccc = u1.equals(u2);
        boolean ddd = u1.equals(u3);
        boolean eee = u1.equals(u4);

        //equals 比较两个对象的内容相等 --> 通常情况下 1.两个对象类型相同 2.两个对象成员变量值相同

        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);
        System.out.println(ddd);
        System.out.println(eee);// --> 此时u1 == u4



















    }


}