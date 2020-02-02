package javaOOP.l3ex1;

import javaOOP.l3ex1.exception.OutOfSizeGroupExeption;

public class Main {
    public static void main(String[] args) {

//        1) Создайте класс, описывающий человека (создайте метод, выводящий информацию о человеке).
//        2) На его основе создайте класс студент (переопределите  метод вывода информации).
//        3) Создайте класс Группа, который содержит массив из 10 объектов класса Студент. Реализуйте методы добавления,
//        удаления студента и метод поиска студента по фамилии. В случае попытки добавления 11 студента, создайте
//        собственное исключение и обработайте его. Определите метод toString() для группы так, что бы он выводил список
//        студентов в алфавитном порядке.
//        4) * Нарисуйте UML диаграмму проекта
//



        Group groupOne = new Group("FE-81mp");

       try {
           groupOne.addStudentToGroup(new Student("Oksana", 25, "cycling",true,true,1,"FE-81mp" ));
           groupOne.addStudentToGroup(new Student("Masha", 5, "cycling",true,true,3,"FE-81mp" ));
           groupOne.addStudentToGroup(new Student("Petr", 23, "hiking",true,false,4,"FE-81mp" ));
           groupOne.addStudentToGroup(new Student("Denis", 18, "cycling",true,false,5,"FE-81mp" ));
           groupOne.addStudentToGroup(new Student("Paul", 16, "drawing",true,false,6 ,"FE-81mp"));
           groupOne.addStudentToGroup(new Student("Rita", 27, "reading books",true,true,7 ,"FE-81mp"));
           groupOne.addStudentToGroup(new Student("Konstantin", 31, "cycling",true,false,8,"FE-81mp"));
           groupOne.addStudentToGroup(new Student("Mia", 21, "cycling",true,true,9 ,"FE-81mp"));
//           groupOne.addStudentToGroup(new Student());
//           groupOne.addStudentToGroup(null);
           groupOne.addStudentToGroup(new Student("Milena", 26, "shopping",true,true,10 ,"FE-81mp"));
           groupOne.addStudentToGroup(new Student("Dima", 22, "painting",true,false,11 ,"FE-81mp"));

           System.out.println();
           System.out.println();

           groupOne.deleteStudentFromGroup(3);
           groupOne.deleteStudentFromGroup(33);

           System.out.println();
           System.out.println();

           groupOne.addStudentToGroup(new Student("Pasha", 20, "driving",true,false,12 ,"FE-81mp"));

           System.out.println();

           System.out.println(groupOne);
       } catch (OutOfSizeGroupExeption e) {
           System.out.println(e.getMessage());
       }
        System.out.println();
        System.out.println(groupOne.searchStudentInGroup("Pasha"));
        System.out.println(groupOne.searchStudentInGroup("Kasha"));

    }
}
