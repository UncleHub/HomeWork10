package HomeWork10;

import java.io.*;
import java.util.Scanner;

public class Writing {

    public static void writeFile(String fileName) {

        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            String line;

             do {

                System.out.println("Write new line, in case you finished type END.");
                line = scanner.nextLine();
                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }while ("END".equals(line)==false);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
