import java.util.Scanner;
import java.text.DecimalFormat;
public class Account 
{
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance =0;
    Scanner input  = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat();

    public int setCustomNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    public int setpinNumber(int pinNumber)
    {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getpinNumber()
    {
        return pinNumber;
    }
    public double getCheckingBalance()
    {
        return checkingBalance;
    }
    public double getSavingBalance()
    {
        return savingBalance;
    }
    //for widthdraw from the chcking account as well as from the savings account.
    public double clcCheckingWidhtdrawl(double amount)
    {
        checkingBalance = (checkingBalance-amount);
        return checkingBalance;
    }

    public double clcSavingsWidthrawl(double amount)
    {
        savingBalance = (savingBalance-amount);
        return savingBalance;
    }

    //for Deposite to the chcking account as well as from the savings account.
    public double clcCheckingDeposit(double amount)
    {
        checkingBalance = (checkingBalance+amount);
        return checkingBalance;
    }

    public double clcSavingsDeposit(double amount)
    {
        savingBalance = savingBalance+amount;
        return savingBalance;
    }

    public void getChecking_WidthdrawInput()
    {
        System.out.println("\nChecking account balance: "+ moneyformat.format(checkingBalance));
        System.out.print("\nEnter the amount you want to withdraw from the account: ");
        double amount = input.nextDouble();

        if((checkingBalance-amount)>=0)
        {
            clcCheckingWidhtdrawl(amount);
            System.out.print("\n\nThe updated amount in the account:"+moneyformat.format(checkingBalance));
            System.out.println("\n---------------------------------------------------------------------------------");
        }
        else{
            System.out.println("THE AMOUNT CANNOT BE NEGATIVE!");
        }
    }


    public void getSavings_WidthdrawInput()
    {
        System.out.println("\nChecking account balance: "+ moneyformat.format(savingBalance));
        System.out.print("\nEnter the amount you want to withdraw from the account: ");
        double amount = input.nextDouble();

        if((savingBalance-amount)>=0)
        {
            clcCheckingWidhtdrawl(amount);
            System.out.print("\n\nThe updated amount in the account:"+moneyformat.format(savingBalance));
            System.out.println("\n---------------------------------------------------------------------------------");
        }
        else
        {
            System.out.println("THE AMOUNT CANNOT BE NEGATIVE!");
        }
    }

    public void getChecking_DepositeInput()
    {
        System.out.println("\nChecking account balance: "+ moneyformat.format(checkingBalance));
        System.out.print("\nEnter the amount you want to deposit to the account: ");
        double amount = input.nextDouble();

        if((checkingBalance+amount)>=0)
        {
            clcCheckingDeposit(amount);
            System.out.print("\n\nThe updated amount in the account:"+moneyformat.format(checkingBalance));
            System.out.println("\n---------------------------------------------------------------------------------");
        }
        else{
            System.out.println("THE AMOUNT CANNOT BE NEGATIVE!");
        }
    }

    public void getSavings_DepositeInput()
    {
        System.out.println("\nChecking account balance: "+ moneyformat.format(savingBalance));
        System.out.print("\nEnter the amount you want to deposit to the account: ");
        double amount = input.nextDouble();

        if((checkingBalance+amount)>=0)
        {
            clcSavingsDeposit(amount);
            System.out.print("\n\nThe updated amount in the account:"+moneyformat.format(savingBalance));
            System.out.println("\n---------------------------------------------------------------------------------");
        }
        else{
            System.out.println("THE AMOUNT CANNOT BE NEGATIVE!");
        }
    }





}
