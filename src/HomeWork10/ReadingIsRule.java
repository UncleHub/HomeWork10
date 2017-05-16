package HomeWork10;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Serega on 16.05.2017.
 */
public class ReadingIsRule {
    public static void readFile(String fileName) {

        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        try  (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String line;

            while ((line=bufferedReader.readLine())!=null)
                System.out.println(line);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
