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
}
