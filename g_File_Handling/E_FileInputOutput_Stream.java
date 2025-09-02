package g_File_Handling;

import java.io.*;

public class E_FileInputOutput_Stream {

    static void stream() {
        try {
            FileInputStream fis = new FileInputStream("input.jpg");
            FileOutputStream fos = new FileOutputStream("output.jpg");

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        stream();
    }
}