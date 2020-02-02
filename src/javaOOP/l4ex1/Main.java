package javaOOP.l4ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1. Усовершенствуйте класс Group, добавив возможность интерактивного добавления объекта.
//        2. Реализуйте возможность сортировки списка студентов по фамилии.
//        3. Реализуйте возможность сортировки по параметру (Фамилия, успеваемость и т. д.).
//        4. Реализуйте интерфейс Военком, который вернет из группы массив студентов - юношей, которым больше 18 лет.
//        5. Протестируйте его работу.


        Group groupOne = new Group("FE-81mp");


        try {
         //   groupOne.addStudentToGroupCondole();
            groupOne.addStudentToGroup(new Student("Masha", 5,true,3,"FE-81mp" ));
            groupOne.addStudentToGroup(new Student("Petr", 23, false,4,"FE-81mp" ));
            groupOne.addStudentToGroup(new Student("Denis", 18,false,5,"FE-81mp" ));
            groupOne.addStudentToGroup(new Student("Alan", 16, false,6 ,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Rita", 27, true,7 ,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Konstantin", 31,false,8,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Zina", 21, true,9 ,"FE-81mp"));
        } catch (OutOfSizeGroupExeption outOfSizeGroupExeption) {
            outOfSizeGroupExeption.printStackTrace();
        }

        System.out.println(groupOne);
        Arrays.sort(groupOne.getStudentsArray(), new UniversalComparator());

        System.out.println(groupOne);





    }
}
