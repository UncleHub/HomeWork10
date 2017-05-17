package HomeWork10;

import java.io.*;

public class ReadingIsRule {
    public static void readFile(String fileName) {

        File file = new File(fileName);

        try  (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String line;

            while ((line=bufferedReader.readLine())!=null)
                System.out.println(line);

        } catch (FileNotFoundException e) {
            System.out.println("There`s no such file: "+fileName+". Try chose other file.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
