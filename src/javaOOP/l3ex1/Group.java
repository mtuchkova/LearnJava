package javaOOP.l3ex1;

public class Group {


    private String groupName;
    private Student[] studentsArray = new Student[10];


    public Group(String groupName) {
        groupName = groupName;
    }

    public Group() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        groupName = groupName;
    }

    public void addStudentToGroup(Student student) {

        for ( int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null){
                studentsArray[i] = student;
            }
        }


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
