package javaOOP.l5ex1;
import java.io.File;


public class Main {
    public static void main(String[] args) {




//
        MyFileFilter mFF = new MyFileFilter("txt", "pdf");
    File folder = new File("D:/myFolder");

    File[] fileList = folder.listFiles(mFF);

    for (File file : fileList) {
        System.out.println(file);
    }
}

}
