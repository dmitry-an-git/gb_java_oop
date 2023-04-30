package task01_proper;

import java.util.Scanner;

public class View implements IntView {
    
    private Scanner sc;
    
    {
        sc = new Scanner(System.in);
    }
    

    @Override
    public int getNumber(String msg){
        System.out.printf("%s: ", msg);
        int a = sc.nextInt();
        return a;
    }
    
    public void printResult(int sum) {
        System.out.printf("Сумма: %d\n\n", sum);
    }
}
