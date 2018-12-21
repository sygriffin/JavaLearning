/**
 * Created by songyang on 2018/12/21.
 */
public class EqualUser {

    public String Ename;

    public int Eage;

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        boolean b = obj instanceof EqualUser;
        if (b) {
            EqualUser user = (EqualUser)obj;
            if (this.Eage == user.Eage && this.Ename.equals(user.Ename)){
                return true;
            }
        }
        return false;
    }

    public EqualUser (String ename, int eage){
        this.Eage = eage;
        this.Ename = ename;
    }

    @Override
    public int hashCode() {

        int result = 17;
        result =  31*result + Eage;
        result = 31*result +Ename.hashCode();

        return result;
    }

    //打印一个对象 -- 先调用对象的toString方法
    @Override
    public String toString() {

        String result = "";

        result = result + "age:" + Eage + " name:" + Ename;

        return result;
    }
}
