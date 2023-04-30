package task03_mine;

import java.util.Scanner;

public class ConsoleView {
    
    public int getSelection(Scanner sc, String message) {
        System.out.printf("%s: ", message);
        return sc.nextInt();
    }

    public void print(String message) {
        System.out.println(message);
    }
}
