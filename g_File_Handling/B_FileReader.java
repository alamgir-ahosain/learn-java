package g_File_Handling;

import java.io.FileReader;
import java.io.IOException;

public class B_FileReader {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char)read);
            } while (read != -1);

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();

        }
    }
}
