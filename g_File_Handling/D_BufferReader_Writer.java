package g_File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D_BufferReader_Writer {

    static void bufferWriter() {
        String fileName = "test.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("BufferdWriter:Alamgir here.");
            bw.flush(); // optional
            System.out.println("Written Succesfully");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    static void bufferReader() {
        String fileName = "test.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        bufferWriter();
        bufferReader();
    }
}
