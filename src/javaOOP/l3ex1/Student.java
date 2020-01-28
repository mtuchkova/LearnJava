package javaOOP.l3ex1;

public class Student extends Human{

    private int studentRecordNumber;
    private int groupNumber;


    public Student(String name, int age, String hobby, boolean isHappy, int studentRecordNumber) {
        super(name, age, hobby, isHappy);
        this.studentRecordNumber = studentRecordNumber;

    }

    public Student() {
    }



    @Override
    public String toString() {
        return "Student{" +
                "recordNumber=" + studentRecordNumber +
                '}';
    }
}
