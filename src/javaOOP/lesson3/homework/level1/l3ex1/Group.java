package javaOOP.lesson3.homework.level1.l3ex1;

import javaOOP.lesson3.homework.level1.l3ex1.exception.OutOfSizeGroupExeption;

public class Group {


    private String groupName;
    private Student[] studentsArray = new Student[10];


    public Group(String groupName) {
        this.groupName = groupName;
    }

    public Group() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        groupName = groupName;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Group: " + this.groupName).append(System.lineSeparator());

        int i = 0;
        for (Student student : studentsArray) {

                sb.append((++i) + ") ").append(student);
                sb.append(System.lineSeparator());

        }
        return sb.toString();


    }



    public void addStudentToGroup(Student student) throws OutOfSizeGroupExeption {

        if (student == null){
            throw new IllegalArgumentException("Student is null");
        }
        for ( int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null){
                studentsArray[i] = student;
                student.setGroup(this.groupName);
                System.out.println(student.getName() + " added to group " + groupName);
                return;
            }
        }
        throw new OutOfSizeGroupExeption();

    }

    public boolean deleteStudentFromGroup(int recordBook) {
        for ( int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] != null && studentsArray[i].getRecordBook() == recordBook){
                studentsArray[i] = null;
                System.out.println("Student with record book " + recordBook + " removed from " + groupName);
                return true ;
            }

        }

        System.out.println("There is no such student! record book: " + recordBook);
        return false;
    }




    public Student searchStudentInGroup(String name) {
        for ( Student student : studentsArray) {
            if (student != null && student.getName().equals(name)){
                return student;
            }
        }

        return null;
    }

}
