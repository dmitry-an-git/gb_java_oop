package task01_proper;

public class Model implements IntModel{
    private int first;
    private int second;

    @Override
    public void setFirst(int number) {
        this.first = number;
    }

    @Override
    public void setSecond(int number) {
        this.second = number;
    }

    @Override
    public int addition() {
        return first+second;
    }
}
