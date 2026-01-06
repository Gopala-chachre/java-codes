package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        // How to write a file sing java (4 popular options)
        /*
            FileWriter = Good for small or medium-sized text file
            BufferedWriter = Better performance for large amount of text
            PrintWriter = Best for structured data, like reports or logs
            FileOutputStream = Best for binary files (e.g. images, audio files)
         */

        // we go with FileWriter

        String text = """
                I like black mustang 1969 V8 engine car.
                buy me a new one.
                thank you.
                """; // we can also give path in that way

        try(FileWriter writer = new FileWriter("text.txt")){ // we can also give file path like: //home//gopalachachre//Downloads//text.txt
            writer.write(text);
            System.out.println("File has been Written.");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e){
            System.out.println("can't Write the file.");
        }

    }
}
