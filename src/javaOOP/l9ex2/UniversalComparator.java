package javaOOP.l9ex2;

import java.util.Comparator;


public class UniversalComparator implements Comparator {


    private int x;

    public UniversalComparator(int x) {
        this.x = x;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        if (student1 == null && student2 != null) {
            return  -1;
        }
        if (student1 != null && student2 == null) {
            return  1;
        }
        if (student1 == null && student2 == null) {
            return  0;
        }

        switch (x){
            case 1:
                return student1.getName().compareTo(student2.getName());

            case 2:
                return student1.getAge() - (student2.getAge());

            case 3:
                return student1.getRecordBook() - (student2.getRecordBook());
            case 4:
                return Boolean.toString(student1.getSex()).compareTo(Boolean.toString(student2.getSex()));
        }
        return 0;
    }
}
