package javaOOP.lesson9.homework.level1.l9ex2;

public class Main {
    public static void main(String[] args) {

//        Модифицируйте класс «Группа» для более удобных методов работы с динамическими массивами.

//        1. Усовершенствуйте класс Group, добавив возможность интерактивного добавления объекта.
//        2. Реализуйте возможность сортировки списка студентов по фамилии.
//        3. Реализуйте возможность сортировки по параметру (Фамилия, успеваемость и т. д.).
//        4. Реализуйте интерфейс Военком, который вернет из группы массив студентов - юношей, которым больше 18 лет.
//        5. Протестируйте его работу.


        Group groupOne = new Group("FE-81mp");


        try {
           // groupOne.addStudentToGroupFromConsole();
            groupOne.addStudentToGroup(new Student("Masha", 5,true,3,"FE-81mp" ));
            groupOne.addStudentToGroup(new Student("Petr", 23, false,4,"FE-81mp" ));
            groupOne.addStudentToGroup(new Student("Denis", 18,false,5,"FE-81mp" ));
            groupOne.addStudentToGroup(new Student("Alan", 16, false,6 ,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Rita", 27, true,7 ,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Konstantin", 31,false,8,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Zina", 21, true,9 ,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Monstantin", 32,false,18,"FE-81mp"));
           // groupOne.addStudentToGroup(new Student("Gena", 13, false,19 ,"FE-81mp"));
           // groupOne.addStudentToGroup(null);
           // groupOne.addStudentToGroup(new Student("Lena", 17, true,45 ,"FE-81mp"));//groupOne.addStudentToGroup(new Student("Lena", 17, true,45 ,"FE-81mp"));
        } catch (OutOfSizeGroupExeption outOfSizeGroupExeption) {
            outOfSizeGroupExeption.printStackTrace();
        }
        groupOne.getGuysOverEighteen();
        System.out.println(groupOne);

        groupOne.deleteStudentFromGroup(7);
        System.out.println(groupOne);

        System.out.println(groupOne.searchStudentInGroup("Kina"));



        groupOne.sortStudentByConvertingToArray(2, false);
        System.out.println(groupOne);


        groupOne.sortStudentByList(4, true);
        System.out.println(groupOne);



    }
}
