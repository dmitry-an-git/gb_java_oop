package task02_mine.contact;

import java.util.Iterator;
import java.util.Scanner;
import task02_mine.contact.fields.*;

public class Contact implements Iterable<TypeField<?>> {
    
    private FieldName name;
    private FieldSurname surname;
    private FieldPhone phone;
    private FieldComment comment;

    public Contact(){
        this("", "", null, "");
    }

    public Contact(String name, Integer phone){
        this(name, "", phone, "");
    }

    public Contact(String name, String surname, Integer phone, String comment){
        this.name = new FieldName();
        this.name.setContent(name);
        this.surname = new FieldSurname();
        this.surname.setContent(surname);
        this.phone = new FieldPhone();
        this.phone.setContent(phone);
        this.comment = new FieldComment();
        this.comment.setContent(comment);
    }

    @Override
    public Iterator<TypeField<?>> iterator() {
        return new FieldIterator();
    }

    public class FieldIterator implements Iterator<TypeField<?>> {
        private int index = -1;

        @Override
        public boolean hasNext() {
            return index++ < 3;
        }

        @Override
        public TypeField<?> next() {
            switch (index) {
                case 0:
                    return name;
                case 1:
                    return surname;
                case 2:
                    return phone;
                default:
                    return comment;
            }
        }
    }

    public TypeField<?> getComment() {
        return comment;
    }
    public TypeField<?> getName() {
        return name;
    }
    public TypeField<?> getPhone() {
        return phone;
    }
    public TypeField<?> getSurname() {
        return surname;
    }

    public void setComment(FieldComment comment) {
        this.comment = comment; 
    }
    public void setName(FieldName name) {
        this.name = name;
    }
    public void setPhone(FieldPhone phone) {
        this.phone = phone;
    }
    public void setSurname(FieldSurname surname) {
        this.surname = surname;
    }

    public Boolean searchKeyword(String key) {
        String stringRepresentation = this.toString();
        if (stringRepresentation.contains(key)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %s", name, surname, phone, comment);
    }
        
    public void updateField(TypeField<?> fieldQuerry, Scanner sc) {
        for (TypeField<?> field : this) {
            if (field.getClass().equals(fieldQuerry.getClass())) {
                System.out.printf("%s: ", field.getName());
                field.readConsole(sc);
            }
            
        }
    }

    public void initiate(Scanner sc) {
        
        for (TypeField<?> field : this) {
            System.out.printf("%s: ", field.getName());
            field.readConsole(sc);
        }
    }

    public TypeField<?> getField(Scanner sc){
        int index = 0;
        for (TypeField<?> field : this) {
            System.out.printf("%d %s\n", index, field.getName());
            index++;
        }
        System.out.printf("Выберите поле для обновления:");
        int selection = sc.nextInt();
        index = 0;
        for (TypeField<?> field : this) {
            if (index == selection){
                return field;
            }
            index++;
        }
        return null;

    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact)obj;
        return this.name == t.name && this.surname == t.surname;
    }
}

