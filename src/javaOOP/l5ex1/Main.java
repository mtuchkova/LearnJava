package javaOOP.l5ex1;
import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

//
//        1. Напишите программу, которая скопирует файлы с заранее
//        определенным расширением(например, только doc) из
//        каталога источника в каталог приемник.
//        2. Напишите программу, которая примет на вход два
//        текстовых файла, а вернет один. Содержимым этого файла
//        должны быть слова, которые одновременно есть и в первом и
//        во втором файле.
//        3. Усовершенствуйте класс, описывающий группу студентов,
//        добавив возможность сохранения группы в файл.
//        4. Реализовать обратный процесс. Т.е. считать данные о
//        группе из файла, и на их основе создать объект типа группа

//
        MyFileFilter mFF = new MyFileFilter("txt", "pdf");

        File folder = new File("D:/myFolder");
        File out = new File("D:/new");

        File[] fileList = folder.listFiles(mFF);

        for (File file : fileList) {
            System.out.println(file);
            try {
                StreamService.fileCopy(folder, out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

}
