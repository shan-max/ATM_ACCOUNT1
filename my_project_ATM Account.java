import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    // write about insertion of logic 

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    // start a new method

    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }
    //start a new method of getCustomerNumber

    public int getCustomerNumber(){
        return customerNumber;
    }
    //set pin number

    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }
    //get pin number

    public int getPinNumber(){
        return pinNumber;
    }
    //get checking balance

    public double getCheckingBalance() {
        return checkingBalance;
    }
    //get saving balance

    public double getSavingBalance(){
        return savingBalance;
    }
    //calculate checking withdraw

    public void calcCheckingWithdraw(double amount){
        checkingBalance -= amount;
    }
    //calculate saving withdraw

    public void calcSavingWithdraw(double amount){
        savingBalance -= amount;
    }
    //calculate checking deposit

    public void calcCheckingDeposit(double amount){
        checkingBalance += amount;
    }
    //calc saving deposit

    public void calcSavingDeposit(double amount){
        savingBalance += amount;
    }
    //get checking withdraw input with new method

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else if (checkingBalance - amount >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Not enough funds.");
        }
    }
    //get saving withdraw input with new method

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else if (savingBalance - amount >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Not enough funds.");
        }
    }
    //get checking deposit input with new method

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount to deposit to Checking Account: ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }
    }
    // get saving deposit input with new method

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount to deposit to Saving Account: ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        }
    }
}
