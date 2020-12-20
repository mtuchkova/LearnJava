package javaOOP.lesson3.homework.level1.l3ex1;

public class Human {


    private String name;
    private int age;
    private String hobby;
    private  boolean isHappy;
    private  boolean sex;

    public Human(String name, int age, String hobby, boolean isHappy, boolean sex) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.isHappy = isHappy;
        this.sex = sex;
    }

    public Human() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", isHappy=" + isHappy +
                ", sex=" + sex +
                '}';
    }
}
