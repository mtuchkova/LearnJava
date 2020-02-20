package javaOOP.lesson11;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        String spec = "https://www.geeksforgeeks.org/list-array-java/";
//        String text = "";
//
//        try {
//            text = NetworkService.getStringFromURL(spec,"UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(text);

//=============================================================================


//        String spec = "https://cdn.journaldev.com/wp-content/uploads/2012/11/java-arraylist-to-array.png";
//        File folder = new File("aaa");
//        folder.mkdirs();
//
//
//        try {
//            NetworkService.getFileFromURL(spec, folder);
//            System.out.println("done");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //=============================================================================

        String spec = "https://cdn.journaldev.com";
        Map<String, List<String>> headers = null;
        try {
           headers = NetworkService.getHeadersFromURL(spec);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<String> keys = headers.keySet();
        for (String key : keys) {

            System.out.println(key + " -> " + headers.get(key));
        }



    }
}
