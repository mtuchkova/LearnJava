package javaOOP.lesson2;

public class Animals {

    private int age;
    private double weigt;
    private boolean sex;
    private String ration;

    public Animals(int age, double weigt, boolean sex, String ration) {
        super();
        this.age = age;
        this.weigt = weigt;
        this.sex = sex;
        this.ration = ration;
    }
    public Animals() {
        super();
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setWeigt(double weigt) {
        this.weigt = weigt;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public int getAge() {
        return age;
    }

    public double getWeigt() {
        return weigt;
    }

    public boolean isSex() {
        return sex;
    }

    public String getRation() {
        return ration;
    }






    public void getVoice() {
    }

    public String toString() {
        return " age=" + age + ", weigt=" + weigt + ", sex=" + sex + ", ration=" +
                ration + "]";
    }


}
