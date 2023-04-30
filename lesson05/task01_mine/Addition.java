package task01_mine;
import java.util.Scanner;

public class Addition {
    public int first;
    public int second;
    public Scanner sc;

    {
        sc = new Scanner(System.in);
    }

    public void run(){
        setFirstInput();
        setSecondInput();
        returnSum();
    }
    public void setFirstInput(){
        System.out.printf("Введите первое число: ");
        int first = sc.nextInt();
        this.first = first; 
    }
    public void setSecondInput(){
        System.out.printf("Введите второе число: ");
        int second = sc.nextInt();
        this.second = second; 
    }
    public void returnSum(){
        System.out.printf("%d + %d = %d\n\n", first, second, first+second);
        this.first = 0;
        this.second = 0;
    }
}
