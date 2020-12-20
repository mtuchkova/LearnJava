package javaOOP.lesson4.homework.level1.l4ex1;

public class Student extends  Human{

    private int recordBook;
    private String group;



    public Student(String name, int age, boolean sex, int recordBook, String group) {
        super(name,age,sex);
        this.recordBook = recordBook;
        this.group = group;
    }


    public Student() {
    }


    public int getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(int recordBook) {
        this.recordBook = recordBook;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                " recordBook=" + recordBook +
                " group=" + group + " " +
                super.toString();
    }

}
