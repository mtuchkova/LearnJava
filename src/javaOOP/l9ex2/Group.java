package javaOOP.l9ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group implements Voencom {

    private String groupName;
    private List<Student> studentsArrayList = new ArrayList<>();


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

    public List<Student> getStudentsArrayList() {
        return studentsArrayList;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Group: " + this.groupName).append(System.lineSeparator());

        int i = 0;
        for (Student student : studentsArrayList) {

            sb.append((++i) + ") ").append(student);
            sb.append(System.lineSeparator());

        }
        return sb.toString();


    }


//    public void addStudentToGroupCondole() throws OutOfSizeGroupExeption {
//
//        Student newStudent = new Student();
//
//        newStudent.setGroup(this.groupName);
//
//        System.out.print("Enter record book number: ");
//        newStudent.setRecordBook(getIntValue());
//        sc.nextLine();
//
//        System.out.print("Enter name: ");
//        newStudent.setName(getStringValue());
//
//        System.out.print("Enter age: ");
//        newStudent.setAge(getIntValue());
//        sc.nextLine();
//
//
//        System.out.print("Enter sex: ");
//        newStudent.setSex(getSex());
//        System.out.println(newStudent);
//
//
//
//        for ( int i = 0; i < studentsArray.length; i++) {
//            if (studentsArray[i] == null){
//                studentsArray[i] = newStudent;
//                newStudent.setGroup(this.groupName);
//                System.out.println(newStudent.getName() + " added to group " + groupName);
//                return;
//            }
//        }
//        throw new OutOfSizeGroupExeption();
//    }
//
//    Scanner sc = new Scanner(System.in);
//
//    public String getStringValue () {
//      if(sc.hasNextLine()) {
//          return sc.nextLine();
//      }
//        throw new IllegalArgumentException("Here should be string value!");
//    }
//
//    public boolean getSex () {
//        String sex = sc.nextLine();
//        if(sex.equals("female")) {
//            return true;
//        } else if (sex.equals("male")){
//            return false;
//        }
//        throw new IllegalArgumentException("Here should be (female/male)string value!");
//    }
//
//    public int getIntValue () {
//        if(sc.hasNextInt()) {
//            return sc.nextInt();
//        }
//        throw new IllegalArgumentException("Here should be int value!");
//    }
//


    public void addStudentToGroup(Student student) throws OutOfSizeGroupExeption {

        if (student == null) {
            throw new IllegalArgumentException("Student is null");
        }

        if (studentsArrayList.size() < 10) {
            this.getStudentsArrayList().add(student);
            student.setGroup(this.groupName);
            // System.out.println(student.getName() + " added to group " + groupName);
            return;
        }
        throw new OutOfSizeGroupExeption();
    }

    //    public boolean deleteStudentFromGroup(int recordBook) {
//        for ( int i = 0; i < studentsArray.length; i++) {
//            if (studentsArray[i] != null && studentsArray[i].getRecordBook() == recordBook){
//                studentsArray[i] = null;
//                System.out.println("Student with record book " + recordBook + " removed from " + groupName);
//                return true ;
//            }
//
//        }
//
//        System.out.println("There is no such student! record book: " + recordBook);
//        return false;
//    }
//
//
//
//
//    public Student searchStudentInGroup(String name) {
//        for ( Student student : studentsArray) {
//            if (student != null && student.getName().equals(name)){
//                return student;
//            }
//        }
//
//        return null;
//    }
//
//    public void sortStudent(int x, boolean reverse) {
//
//        switch (x) {
//            case 1:
//                System.out.println("Sort by name: ");
//                break;
//            case 2:
//                System.out.println("Sort by age: ");
//                break;
//            case 3:
//                System.out.println("Sort by recordBook: ");
//                break;
//            case 4:
//                System.out.println("Sort by sex: ");
//                break;
//        }
//
//        if(reverse == true) {
//            Arrays.sort(this.getStudentsArray(), new UniversalComparator(x).reversed());
//        } else {
//            Arrays.sort(this.getStudentsArray(), new UniversalComparator(x));
//        }
//    }
//
//
    @Override
    public Student[] getGuysOverEighteen() {
        int i = 0;
        for (Student student : studentsArrayList) {
            if (student != null && student.getSex() == false && student.getAge() >= 18) {
                i++;
            }
        }
        System.out.println(i);
        Student[] guysOverEighteen = new Student[i];
        int j = 0;
        for (Student student : studentsArrayList) {
            if (student != null && student.getSex() == false && student.getAge() >= 18) {
                guysOverEighteen[j++] = student;
            }
        }
        return guysOverEighteen;
    }
}


