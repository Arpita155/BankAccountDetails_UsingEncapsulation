package Miniproject.Encapsulation_BankAccount;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private float balance;
    private String accountHolderAddress;


    public float getBalance() {
        return balance;
    }

    public BankAccount(String customerName, float initialDeposit, String homeAddress){
        Bank.totalAccount++;

        // set accountHolder Name
        this.accountHolderName = customerName;

        // set balance
        if(initialDeposit < 0){
            this.balance = 0f;
        }else{
            this.balance = initialDeposit;
        }

        // set accountHolder Address
        if(homeAddress != null && !homeAddress.trim().isEmpty()){
            this.accountHolderAddress = homeAddress;
        }

        // set account Number
        this.accountNumber = Bank.fixedNumber + Bank.totalAccount;
    }

    // Check Balance
    public void checkBalance(){
        System.out.println("Your current Balance is :"+getBalance());
    }

    // Deposit
    public void deposit(int depositAmount){

        if(depositAmount < 0){
            System.out.println("please give +ve number to deposit");
        }else{
            this.balance +=depositAmount;
            System.out.println("deposit Amount : "+depositAmount);
            System.out.println("after deposit your current balance : "+this.balance);
        }
    }

    // Withdraw
    public void withdraw(int withdrawAmount){
        if(withdrawAmount > 0 && withdrawAmount <= this.balance){
            this.balance -= withdrawAmount;
            System.out.println("withdraw Amount : "+withdrawAmount);
            System.out.println("after withdraw your current balance : "+this.balance);
        }else{
            System.out.println("put right amount to withdraw");
        }
    }


    // Account Information
    public void accountInfo(){
        System.out.println("-------B3-Bank-------");
        System.out.println("===============================");
        System.out.println("------Details of the Account Holder-------");
        System.out.println("================================");
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder Address : "+accountHolderAddress);
        System.out.println("Balance : "+balance);
    }
}
