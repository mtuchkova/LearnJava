package javaOOP.lesson5.homework.level1.l5ex1;

import java.io.*;

public class StreamService {


    private StreamService() {
    }

    public static void fileCopy (File in, File out) throws IOException {
        try(InputStream is = new FileInputStream(in);
            OutputStream os = new FileOutputStream(out)) {

            copy(is, os);

        } catch (IOException e) {
            throw e;
        }

    }


    public static void copy(InputStream is, OutputStream os) throws IOException{
        byte [] buffer = new byte[10_000_000];
        int readByte = 0;

        for (;(readByte = is.read(buffer)) > 0;) {
            os.write(buffer, 0, readByte);
        }
    }
}
