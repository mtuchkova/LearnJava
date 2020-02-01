package javaOOP.l3ex1;

public class Student extends Human{

    private int recordBook;


    public Student(String name, int age, String hobby, boolean isHappy, boolean sex, int recordBook) {
        super(name, age, hobby, isHappy,sex);
        this.recordBook = recordBook;
    }


    public Student() {
    }


    public int getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(int recordBook) {
        this.recordBook = recordBook;
    }


    @Override
    public String toString() {
        return "Student{" +
                "recordBook=" + recordBook +
                super.toString();
    }
}
