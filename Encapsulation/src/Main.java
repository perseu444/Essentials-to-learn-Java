
class Account{

    private int balance = 1000;

    void deposit(int money){
        balance = balance + money;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
public class Main {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setBalance(200);
        System.out.println(account1.getBalance());

    }
}