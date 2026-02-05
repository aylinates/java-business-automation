import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);

            int lineCount = 0;

            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }

            scanner.close();
            System.out.println("Total lines in file: " + lineCount);

        } catch (FileNotFoundException e) {
            System. out.println("File not found!");
        }
    }
}
