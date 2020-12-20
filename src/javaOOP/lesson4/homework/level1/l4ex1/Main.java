package javaOOP.lesson4.homework.level1.l4ex1;

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
            groupOne.addStudentToGroup(new Student("Monstantin", 32,false,18,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Gena", 13, false,19 ,"FE-81mp"));
            groupOne.addStudentToGroup(new Student("Lena", 17, true,45 ,"FE-81mp"));
        } catch (OutOfSizeGroupExeption outOfSizeGroupExeption) {
            outOfSizeGroupExeption.printStackTrace();
        }


        groupOne.sortStudent(4, false);
        System.out.println(groupOne);


        Student[] guysOverEighteen  = groupOne.getGuysOverEighteen();
        for (Student student : guysOverEighteen) {
            System.out.println(student);
        }


//        groupOne.sortStudent(2);
//        System.out.println(groupOne);





    }
}
