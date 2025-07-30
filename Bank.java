package Miniproject.Encapsulation_BankAccount;

import java.util.Scanner;

public class Bank {
    static int totalAccount;
    static int fixedNumber;

    static {
        System.out.println("B3-Bank me apka swagat hai.");
        totalAccount = 0;
        fixedNumber = 90456732;
    }
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Apita Sahoo",5000,"Barrackpore");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Password:");
        int PW = sc.nextInt();
        do{
            if(PW==4321){
                while (true){
                    System.out.println("Choose what you want to perform:");
                    System.out.println(" 1. --> Check Balance   2.--> Deposit    3.--> Withdraw   4.EXIT ");
                    System.out.println("Enter the option: ");
                    int option = sc.nextInt();

                    switch (option){
                        case 1:
                            obj.checkBalance();
                            break;
                        case 2:
                            System.out.println("enter the amount to deposit");
                            int m = sc.nextInt();
                            obj.deposit(m);
                            break;
                        case 3:
                            System.out.println("enter the amount to withdraw");
                            int n = sc.nextInt();
                            obj.withdraw(n);
                            break;
                        case 4:
                            System.out.println("Existing System. Thank you for choosing B3-Bank!! Have a good day!");
                            sc.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option, choose the right option");
                    }
                    obj.accountInfo();
                }
            }
            else{
                System.out.println("Wrong Password ! Please enter right password");
                PW = sc.nextInt();
            }
        }while (true);



    }
}
