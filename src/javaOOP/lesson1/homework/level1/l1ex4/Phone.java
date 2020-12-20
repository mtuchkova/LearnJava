package javaOOP.lesson1.homework.level1.l1ex4;

public class Phone {

    private String number;
    private String name;

    public Phone(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone() {
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void registerInMobileOperator() {
//  Телефон должен иметь метод
//  регистрации в сети мобильного оператора.
    }



    public void call() {

//       Также у телефона должен быть метод call
//       (номер другого телефона) который переберет все телефоны, зарегистрированные в
//       сети.

//        Если такой номер будет найден, то осуществить вызов, если нет - вывести
//        сообщение об ошибочности набранного номера.
    }



}