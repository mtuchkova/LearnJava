package javaEssential.lesson3.homework.hm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Please, enter the key: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String key = reader.readLine();
            DocumentWorker documentWorker = null;
            if (key.isEmpty()){
                documentWorker = new DocumentWorker();
            } else if (key.equals("exp")){
                documentWorker = new ExpertDocumentWorker();
            } else if (key.equals("pro")){
                documentWorker = new ProDocumentWorker();
            }
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
