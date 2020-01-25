package javaOOP.lesson2;

public class Cat extends Animals {


    private String name;
    private String type;


    public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
        super(age, weigt, sex, ration);
        this.name = name;
        this.type = type;
    }

//    public Cat(String name, String type) {
//        this.name = name;
//        this.type = type;
//    }


    public String getName() {
        return name;
    }

    @Override
    public void getVoice() {
        System.out.println("Meoooow!");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                super.toString();
    }
}
