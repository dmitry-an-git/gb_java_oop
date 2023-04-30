package task02_mine.contact.fields;

import java.util.Scanner;

public abstract class TypeFieldNumeric extends TypeField<Integer> {

    @Override
    public void readConsole(Scanner sc) {
        setContent(sc.nextInt());
    }

}
