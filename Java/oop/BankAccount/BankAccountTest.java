package BankAccount;

public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account1=new BankAccount(500,200);
        BankAccount account2=new BankAccount(200,100);
        BankAccount account3=new BankAccount();
        account1.depositMoney(200, false);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());
        System.out.println(account1.getTotal());
        System.out.println(BankAccount.totalOfAllMoney());
        System.out.println(BankAccount.totalOfAllAccount());
    }
}
