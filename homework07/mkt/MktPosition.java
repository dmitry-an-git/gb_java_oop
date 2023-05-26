package mkt;

public abstract class MktPosition {

    public String title = "Должность";
    public double minSalary = 0;
    public double maxSalary = 1;

    public double getMaxSalary() {
        return maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public String getTitle() {
        return title;
    }
}
