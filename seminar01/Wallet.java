/**
 * Кошелек
 */
public class Wallet {
    
    private double balance;

    {
        balance = 0;
    }

    public Wallet(){
        this(0);
    }

    public Wallet(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("В кошельке денег: %.2f", this.balance);
    }

    public void tellBalance() {
        System.out.println(this.toString());
    }

    public boolean flushBalance(double cost) {
        if (this.balance - cost < 0) {
            return false;
        } else {
            this.balance -= cost;
            return true;
        }
    }

    public void topUpBalance(double deposit) {
        if (deposit > 0) {
            this.balance += deposit;
        } else {
            System.out.println("Неверный ввод!");
        }
    }

}
