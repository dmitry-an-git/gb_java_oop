package task02_mine.contact.fields;

import java.util.Scanner;

public abstract class TypeFieldText extends TypeField<String>{
    
    @Override
    public void readConsole(Scanner sc) {
        setContent(sc.next());
        
    }

}
