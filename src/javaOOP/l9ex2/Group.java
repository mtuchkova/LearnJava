package javaOOP.l9ex2;

import java.util.*;

public class Group implements Voencom {

    private String groupName;
    private List<Student> studentsArrayList = new ArrayList<>();
    private List<Student> guysOverEighteen  = new ArrayList<>();


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
        sb.append("\nGroup: " + this.groupName).append(System.lineSeparator());

        int i = 0;
        for (Student student : studentsArrayList) {

            sb.append((++i) + ") ").append(student);
            sb.append(System.lineSeparator());

        }

        sb.append("\nGuys over eighteen in " + this.groupName + ":").append(System.lineSeparator());
        int j = 0;
        for (Student student : guysOverEighteen) {

            sb.append((++j) + ") ").append(student);
            sb.append(System.lineSeparator());

        }
        return sb.toString();
    }


    public void addStudentToGroupFromConsole() throws OutOfSizeGroupExeption {

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



        if (studentsArrayList.size() < 10) {
            this.getStudentsArrayList().add(newStudent);
            return;
        }

        throw new OutOfSizeGroupExeption();
    }

    Scanner sc = new Scanner(System.in);

    public String getStringValue() {
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        throw new IllegalArgumentException("Here should be string value!");
    }

    public boolean getSex() {
        String sex = sc.nextLine();
        if (sex.equals("female")) {
            return true;
        } else if (sex.equals("male")) {
            return false;
        }
        throw new IllegalArgumentException("Here should be (female/male)string value!");
    }

    public int getIntValue() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        throw new IllegalArgumentException("Here should be int value!");
    }



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

        public boolean deleteStudentFromGroup(int recordBook) {
        for (Student temp : studentsArrayList) {
            if (temp.getRecordBook() == recordBook){
                this.getStudentsArrayList().remove(temp);
                System.out.println("Student with record book " + recordBook + " removed from " + groupName);
                return true ;
            }

        }

        System.out.println("There is no such student! record book: " + recordBook);
        return false;
    }




    public Student searchStudentInGroup(String name) {
        for ( Student student : studentsArrayList) {
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }


    public void sortStudentByConvertingToArray(int x, boolean reverse) {

        switch (x) {
            case 1:
                System.out.println("Sort by name: ");
                break;
            case 2:
                System.out.println("Sort by age: ");
                break;
            case 3:
                System.out.println("Sort by recordBook: ");
                break;
            case 4:
                System.out.println("Sort by sex: ");
                break;
        }

        Student[] studentsArray =  studentsArrayList.toArray( new Student[this.getStudentsArrayList().size()]);

        if(reverse == true) {
            Arrays.sort(studentsArray, new UniversalComparator(x).reversed());
            studentsArrayList = Arrays.asList(studentsArray);
        } else {
            Arrays.sort(studentsArray, new UniversalComparator(x));
            studentsArrayList = Arrays.asList(studentsArray);
        }
    }

    public void sortStudentByList(int x, boolean reverse) {

        switch (x) {
            case 1:
                System.out.println("Sort by name: ");
                break;
            case 2:
                System.out.println("Sort by age: ");
                break;
            case 3:
                System.out.println("Sort by recordBook: ");
                break;
            case 4:
                System.out.println("Sort by sex: ");
                break;
        }

        Student[] studentsArray =  studentsArrayList.toArray( new Student[this.getStudentsArrayList().size()]);

        if(reverse == true) {
            Collections.sort(studentsArrayList, new UniversalComparator(x).reversed());
        } else {
            Arrays.sort(studentsArray, new UniversalComparator(x));
            Collections.sort(studentsArrayList, new UniversalComparator(x));
        }
    }

    @Override
    public List<Student> getGuysOverEighteen() {
        int i = 0;
        for (Student student : studentsArrayList) {
            if (!student.getSex() && student.getAge() >= 18) {
                i++;
            }
        }

        for (Student student : studentsArrayList) {
            if (!student.getSex() && student.getAge() >= 18) {
                guysOverEighteen.add(student);
            }
        }
        return guysOverEighteen;
    }
}


