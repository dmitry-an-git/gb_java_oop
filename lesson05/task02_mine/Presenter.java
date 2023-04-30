package task02_mine;

import java.util.Scanner;

import task02_mine.contact.*;
import task02_mine.contact.fields.TypeField;


public class Presenter {
    public void run(){
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        View v = new View(sc);
        PhoneBook pb = new PhoneBook();
        
        System.out.println("1 - add");
        System.out.println("2 - lookup");
        System.out.println("3 - delete");
        System.out.println("4 - update");
        System.out.println("5 - print all");

        while (cont) {
            int key = v.getInteger("Выберите действие");
            switch (key) {
                case 1:
                    Contact c = new Contact();
                    c.initiate(sc);
                    pb.addContact(c);
                    break;
                case 2:
                    String querry = v.getString("Введите ключевое слово для поиска");
                    pb.searchContact(querry);
                    break;
                case 3: 
                    int index = v.getInteger("Введите индекс для удаления");
                    pb.removeContact(index);
                    break;
                case 4:
                    int index4 = v.getInteger("Введите индекс для ");
                    Contact c4 = pb.getContact(index4);
                    TypeField<?> f4 = c4.getField(sc);
                    c4.updateField(f4, sc);
                case 5:
                    pb.print();
                    break;
                default:
                    cont = false;
                    break;
            }
        }
    }
}
