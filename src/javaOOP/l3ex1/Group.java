package javaOOP.l3ex1;

import javaOOP.l3ex1.exception.OutOfSizeGroupExeption;

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

    public void addStudentToGroup(Student student) throws OutOfSizeGroupExeption {

        if (student == null){
            throw new IllegalArgumentException("Student is null");
        }
        for ( int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null){
                studentsArray[i] = student;
                student.setGroup(this.groupName);
                System.out.println("Студент " + student.getName() + " записан в группу " + groupName);
                return;
            }
        }
        throw new OutOfSizeGroupExeption();

    }

//    public void deleteStudentFromGroup() {
//
//    }



//
//    public Student searchStudentInGroup(name) {
//
//        return Student;
//    }

}
