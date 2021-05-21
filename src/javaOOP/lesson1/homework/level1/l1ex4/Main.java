package javaOOP.lesson1.homework.level1.l1ex4;

public class Main {
    public static void main(String[] args) {


//        Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
//        класс Network (сеть мобильного оператора). Телефон должен иметь метод
//        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
//        (номер другого телефона), который переберет все телефоны, зарегистрированные в
//        сети. Если такой номер будет найден, то осуществить вызов, если нет - вывести
//        сообщение об ошибочности набранного номера.

        Phone phoneMasha = new Phone("+380637388456", "Masha");
        Phone phoneDenis = new Phone("+380953238394", "Denis");
        Network vodafone = new Network("vodafone");
        phoneDenis.registerInMobileOperator(vodafone);
        vodafone.printArrayNumber();
        System.out.println(phoneDenis.call(vodafone, phoneMasha.getNumber()));
        phoneMasha.registerInMobileOperator(vodafone);
        System.out.println(phoneDenis.call(vodafone, phoneMasha.getNumber()));

    }
}