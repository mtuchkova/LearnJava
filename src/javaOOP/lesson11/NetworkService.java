package javaOOP.lesson11;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class NetworkService {


    public static String getStringFromURL(String spec, String code) throws IOException {

        String result = "";

        //подкючение
        URL url = new URL(spec);

        //получение доступа
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        try (InputStream is = con.getInputStream()){
            BufferedReader br = new BufferedReader(new InputStreamReader(is, code));
            String temp = "";
            for (;(temp = br.readLine())!=null;) {
                result +=temp + System.lineSeparator();
            }

        } catch (IOException e ){
            throw  e;
        }
        return result;
    }


    public static void getFileFromURL(String spec, File folder)throws IOException {

        //подкючение
        URL url = new URL(spec);

        //получение доступа
        HttpURLConnection con = (HttpURLConnection) url.openConnection();


        int n = spec.lastIndexOf("/");
        String fileName = spec.substring(n + 1);


        folder.mkdirs();
        File file = new File(folder, fileName);


        try (InputStream is = con.getInputStream()){
           OutputStream os = new FileOutputStream(file);
           byte[] buffer = new byte[1_000_000];
           int readByte = 0;


           for (;(readByte = is.read(buffer)) > 0;){
               os.write(buffer, 0, readByte);
           }

        }catch (IOException e){
            throw e;
        }
    }


    public static Map<String, List<String>> getHeadersFromURL(String spec) throws IOException {
        //подкючение
        URL url = new URL(spec);

        //получение доступа
        HttpURLConnection con = (HttpURLConnection) url.openConnection();


        return con.getHeaderFields();
    }


}
