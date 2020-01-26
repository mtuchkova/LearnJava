package javaOOP.l3ex1;

public class Human {


    private String name;
    private int age;
    private String hobby;
    private  boolean isHappy;

    public Human(String name, int age, String hobby, boolean isHappy) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.isHappy = isHappy;
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


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", isHappy=" + isHappy +
                '}';
    }
}
