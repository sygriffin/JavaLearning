/**
 * Created by songyang on 2019/3/6.
 */
public class Animal {

    public String color;

    public Integer leg_counts;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLeg_counts() {
        return leg_counts;
    }

    public void setLeg_counts(Integer leg_counts) {
        this.leg_counts = leg_counts;
    }

    public void eat(String name) {
        System.out.println(name + " eat");
    }

    public void  sleep(String name) {
        System.out.println(name + " sleep");
    }



}
