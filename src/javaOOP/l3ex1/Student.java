package javaOOP.l3ex1;

public class Student extends Human{

    private int recordNumber;


    public Student(String name, int age, String hobby, boolean isHappy, int recordNumber) {
        super(name, age, hobby, isHappy);
        this.recordNumber = recordNumber;
    }

    public Student() {
    }

    public Student(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "recordNumber=" + recordNumber +
                '}';
    }
}
