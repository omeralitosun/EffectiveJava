import java.io.*;
import java.util.Scanner;

public class Main {

    public void tryCatchFinally(String src){

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(src));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public void tryWithResource(String src){

        try (Scanner scanner = new Scanner(new File(src))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
