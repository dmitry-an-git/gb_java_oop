package task02_mine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import task02_mine.contact.Contact;


/**
 * DataBase
 */

public class PhoneBook implements Iterable<Contact>{
    
    private final List<Contact> db;

    public PhoneBook(){
        this.db = new ArrayList<>();
    }

    public void addContact(Contact c) {
        db.add(c);
        System.out.println("Контакт добавлен");
    }

    public Contact getContact(int index) {
        return db.get(index);
    }

    public void removeContact(int index) {
        if (index>=0 && index<db.size()) {
            db.remove(index);
            System.out.println("Контакт удален");
        } else {
            System.out.println("Неверный индекс");
        }
    }
   
    @Override
    public Iterator<Contact> iterator() {
        return db.iterator();
    }

    public void print(){
        for (Contact contact : this) {
            printContact(contact);
        }
    }

    public void searchContact(String key){
        for (Contact contact : db) {
            if (contact.searchKeyword(key)) {
                printContact(contact);
            }
        }
    }

    public void printContact(Contact contact){
        String str = String.format("%d, %s", db.indexOf(contact), contact.toString());
        System.out.println(str);
    }
    




}