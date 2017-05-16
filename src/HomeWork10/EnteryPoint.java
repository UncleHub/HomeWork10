package HomeWork10;

import java.util.Scanner;

public class EnteryPoint {
    public static void main(String[] args) {


        String fileName, choose;
        Scanner cs = new Scanner(System.in);

        System.out.println("If you want create new file type '1'.\nIf you want read file type '2'.\nFor exit type '0'.");
        choose=cs.nextLine();
        switch (choose){
            case ("1"):{
                Writing writing = new Writing();
                System.out.println("Enter name of new file:");
                fileName = cs.nextLine();
                writing.writeFile(fileName);
            }
            case ("2"):{
                ReadingIsRule read = new ReadingIsRule();
                System.out.println("Enter name of file you want read:");
                fileName = cs.nextLine();
                read.readFile(fileName);

            }
            case ("0"):break;
        }


    }
}
