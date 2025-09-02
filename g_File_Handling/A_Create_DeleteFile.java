package g_File_Handling;

import java.io.File;
import java.io.IOException;

public class A_Create_DeleteFile {
    static void createFileFunc() {
        File file = new File("test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created:" + file.getName());
            } else {
                System.out.println("File alreat exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deleteFileFunc() {
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("File Deleted Succesfully");
        } else {
            System.out.println("Failed to delete ");
        }
    }

    public static void main(String[] args) {

        createFileFunc();
        deleteFileFunc();

    }
}
