package task02_mine;

import java.util.Scanner;

public class View {
    Scanner sc;

    public View(Scanner sc){
        this.sc = sc;
    }

    public String getString(String msg){
        System.out.printf("%s: ", msg);
        String input = sc.next();
        return input;
    }
    public int getInteger(String msg){
        System.out.printf("%s: ", msg);
        int input = sc.nextInt();
        return input;
    }






}
