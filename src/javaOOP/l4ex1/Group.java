package javaOOP.l4ex1;

import java.util.Scanner;

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

    public Student[] getStudentsArray() {
        return studentsArray;
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



    public void addStudentToGroupCondole() throws OutOfSizeGroupExeption {

        Student newStudent = new Student();

        newStudent.setGroup(this.groupName);

        System.out.print("Enter record book number: ");
        newStudent.setRecordBook(getIntValue());
        sc.nextLine();

        System.out.print("Enter name: ");
        newStudent.setName(getStringValue());

        System.out.print("Enter age: ");
        newStudent.setAge(getIntValue());
        sc.nextLine();


        System.out.print("Enter sex: ");
        newStudent.setSex(getSex());
        System.out.println(newStudent);



        for ( int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null){
                studentsArray[i] = newStudent;
                newStudent.setGroup(this.groupName);
                System.out.println(newStudent.getName() + " added to group " + groupName);
                return;
            }
        }
        throw new OutOfSizeGroupExeption();
    }

    Scanner sc = new Scanner(System.in);

    public String getStringValue () {
      if(sc.hasNextLine()) {
          return sc.nextLine();
      }
        throw new IllegalArgumentException("Here should be string value!");
    }

    public boolean getSex () {
        String sex = sc.nextLine();
        if(sex.equals("female")) {
            return true;
        } else if (sex.equals("male")){
            return false;
        }
        throw new IllegalArgumentException("Here should be (female/male)string value!");
    }

    public int getIntValue () {
        if(sc.hasNextInt()) {
            return sc.nextInt();
        }
        throw new IllegalArgumentException("Here should be int value!");
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
