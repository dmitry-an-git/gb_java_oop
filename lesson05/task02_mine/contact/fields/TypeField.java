package task02_mine.contact.fields;

import java.util.Scanner;

/**
 * FieldAbs
 */
public abstract class TypeField<T> {

    String name;
    T content;

    public TypeField(){}

    public void setName(String name) {
        this.name = name;
    }
    public void setContent(T content) {
        this.content = content;
    }
    public String getName() {
        return name;
    }
    public T getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content.toString();
    }

    public abstract void readConsole(Scanner sc);

    @Override
    public boolean equals(Object obj) {
        TypeField<T> t = (TypeField<T>)obj;
        return this.toString().equals(t.toString());
    }
}