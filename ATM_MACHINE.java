
import java.util.Scanner;

public class ATM_MACHINE {
    public static int withdraw(int balance, int withdrawal_amount) {
        System.out.println("Enter the amount you want to withdraw : ");
        Scanner sc = new Scanner(System.in);
        withdrawal_amount = sc.nextInt();
        if (withdrawal_amount > balance) {
            System.out.println("Your balance is not sufficiant to withdraw this amount.");
        } else {
            int current = balance - withdrawal_amount;
            System.out.println("Your current balance is : " + current);
            System.out.println("Amount withdrawl is successfull.");
        }
        sc.close();
        return 0;
    }

    public static int deposit(int balance, int deposited_amount) {
        System.out.println("Enter the amount you want to deposit : ");
        Scanner sc = new Scanner(System.in);
        deposited_amount = sc.nextInt();
        int current = balance + deposited_amount;
        System.out.println("Your current balance is : " + current);
        System.out.println("Amount deposited successfully.");
        sc.close();
        return 0;
    }

    public static int checkBalance(int balance) {
        System.out.println(balance);
        return 0;
    }

    public static void main(String[] args) {
        int balance = 1000, withdrawal_amount = 0, deposited_amount = 0;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Withdrawl\tPress 2 for deposit Cash\tPress 3 to Check Your Balance");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                withdraw(balance, withdrawal_amount);
                break;
            case 2:
                deposit(balance, deposited_amount);
                break;
            case 3:
                checkBalance(balance);
            case 4:
                break;
            default:

                break;
        }
        System.out.println("THANK YOU!!");
        sc.close();

    }

}
