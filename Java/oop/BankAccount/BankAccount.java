package BankAccount;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccountCreated =0;
    public static double totalAmountOfMoney=0;

    public BankAccount(double checkingBalance,double savingsBalance){
        this.checkingBalance=checkingBalance;
        this.savingsBalance=savingsBalance;
        numberOfAccountCreated ++;
        totalAmountOfMoney =totalAmountOfMoney +savingsBalance +checkingBalance;
    }

    public BankAccount(){
        numberOfAccountCreated ++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void depositMoney(double amount,boolean wayTodeposit){
        if(wayTodeposit == true){
            this.checkingBalance +=amount;
        }
        if(wayTodeposit == false){
            this.savingsBalance +=amount;
        }
        totalAmountOfMoney +=amount;
    }
    public void withdrawMoney(double amount){
        if(this.savingsBalance <=0){
            System.out.println("There are insufficient funds." );
        }
        else {
            this.savingsBalance -=amount;
        }
        totalAmountOfMoney -=amount;
    }
    public double getTotal(){
        double total=this.checkingBalance + this.savingsBalance;
        return total;
    }
    public static double totalOfAllAccount(){
        return numberOfAccountCreated;
    }
    public static double totalOfAllMoney(){
        return totalAmountOfMoney;
    }
}
