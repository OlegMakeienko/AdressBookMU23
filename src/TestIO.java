import io.GlobalConfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) {
        try {
            FileReader fr = GlobalConfig.initGlobalConfig();
            Scanner scan = new Scanner(fr);
            String data = scan.nextLine();

            String[] words = data.split(" ");

                for (String word : words) {
                    System.out.println(word);
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
