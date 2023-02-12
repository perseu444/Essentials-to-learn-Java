public class Main {

    public static void main(String[] args) {

        class BankAccount{
            String accountNumber;
            long balance;
            String userName;
            String userLastName;
            String address;
            int age;

            public String getaccountNumber() {
                return accountNumber;
            }

            public void setaccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
            }

            public long getBalance() {
                return balance;
            }

            public void setBalance(long balance) {
                this.balance = balance;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserLastName() {
                return userLastName;
            }

            public void setUserLastName(String userLastName) {
                this.userLastName = userLastName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void addMoney(long ammount){
                balance = balance + ammount;
            }

            public void reduceMoney(long ammount){
                balance = balance - ammount;
            }

            public BankAccount(String accountNumber, long balance, String userName, String userLastName, String address, int age) {
                this.accountNumber = accountNumber;
                this.balance = balance;
                this.userName = userName;
                this.userLastName = userLastName;
                this.address = address;
                this.age = age;
            }
        }


        BankAccount LarryAccount = new BankAccount("1234567", 200, "Larry", "Michael","New Yourk", 39);
        System.out.println(LarryAccount.getaccountNumber());

        //Adding balance to Larry's account
        LarryAccount.addMoney(200);
        LarryAccount.reduceMoney(100);

        System.out.println(LarryAccount.getBalance());





    }
}
