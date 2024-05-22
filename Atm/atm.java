import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        int acc = 203562;
        int balance = 10000;

        System.out.println("---------------------------  ATM  --------------------------");
        System.out.println("Account Number : " + acc);
        System.out.println("------------------------------------------------------------");
        System.out.println("Balance        : " + balance);
        System.out.println("------------------------------------------------------------");

        function f = new function();
        f.bank();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Choice : ");
        f.banking = scan.nextLine();

        switch (f.banking) {
            case "Balance":
                System.out.println("---------------------  " + f.banking + "  --------------------");
                System.out.println("Account Number  : " + acc);
                System.out.println("------------------------------------------------------------");
                System.out.println("Balance         : " + balance);
                System.out.println("------------------------------------------------------------");
                break;
            case "Deposit":
                System.out.println("---------------------  " + f.banking + "  --------------------");
                System.out.print("Enter the Deposit amount : ");
                int deposit = scan.nextInt();
                System.out.println();
                System.out.println("Account Number  : " + acc);
                System.out.println("Deposit Amount  : " + deposit);
                System.out.println("------------------------------------------------------------");
                int depositBalance = balance + deposit;
                System.out.println("Balance         : " + depositBalance);
                System.out.println("------------------------------------------------------------");
                break;
            case "Withdraw":
                System.out.println("--------------------  " + f.banking + "  ---------------------");
                System.out.print("Enter the Withdraw amount : ");
                int withdraw = scan.nextInt();
                System.out.println();
                System.out.println("Account Number  : " + acc);
                System.out.println("Withdraw Amount : "+ withdraw);
                System.out.println("------------------------------------------------------------");
                int withdrawBalance = balance - withdraw;
                System.out.println("Balance         : " + withdrawBalance);
                System.out.println("------------------------------------------------------------");
            default:
                break;
        }
        scan.close();
    }
}
