package g_File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class A_FileWriter {

    static void firstMethod() {
        String fileName = "test.txt"; // define file name,create if not exist
        FileWriter writer = null;
        try {

            writer = new FileWriter(fileName); // create file writer object
            writer.write("Alamgir here."); //write a string
            writer.flush(); // optional
            System.out.println("Written Succesfully");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        } finally {

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    static void secondMethod() {
        String fileName = "test.txt"; // define file name,create if not exist
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Alamgir here.");
            writer.flush(); // optional
            System.out.println("Written Succesfully");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        firstMethod();
        secondMethod();

    }

}
