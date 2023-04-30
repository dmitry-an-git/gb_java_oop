package task01_proper;

public class Presenter {
    
    private View v;
    private Model m;


    public Presenter(View v, Model m){
        this.v = v;
        this.m = m;
    }
   
    public void run() {

        m.setFirst(v.getNumber("Первое число"));
        m.setSecond(v.getNumber("Второе число"));
        v.printResult(m.addition());

    }
}
