package File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {

        // How to read a file using java (3 popular options)
        /*
            BufferedWriter + FileReader = Best for reading text files line-by-line
            FileInputStream = Best for binary files (e.g. images, audio files)
            RandomAccessFile = Best for read/write specific portions of a large file
         */

        String filePath = "text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File is not found!!!");
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }

    }
}
