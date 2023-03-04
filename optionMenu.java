
import java.util.Scanner;
import java.util.HashMap;
import java.text.DecimalFormat;
import java.io.IOException;
public class optionMenu extends Account
{
    Scanner menuInput = new Scanner (System.in);
    DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data = new HashMap<Integer, Integer>(); //mapping customer number and pin number.
    public void getlogin() throws IOException
    {
        int x=1;
        do{
            try{
                data.put(93305, 2001);
                data.put(92395,1974);
                System.out.println("\n================== Welcome to ATM Project ======================");
                System.out.println("--ENTER CREDENTIALS--\n");
                System.out.print("Enter your Customer Number: ");
                setCustomNumber(menuInput.nextInt());


                System.out.print("Enter your Pin Number: ");
                setpinNumber(menuInput.nextInt());


                
            }catch(Exception e){
                System.out.println("\n" + "Invalid characters . Only Numbers. "+"\n");
                x=2;
        }

            int cn = getCustomerNumber();
            int pn = getpinNumber();

            if(data.containsKey(cn)&&data.get(cn) == pn)
            {
                getAccounttype();
            }
            else
            {
                System.out.println("Wrong Customer number or Pin. "+"\n");
            }

        }while(x==1);
    }

    public void  getAccounttype()
    {
        System.out.println("\n\n=========================== ACCOUNT SELECTION =============================\n");
        System.out.println("Select the type of account you want to access: ");
        System.out.println("-------------------------------------------------");
        System.out.println("** Type 1: for Chekcking account");
        System.out.println("** Type 2: for Savings account");
        System.out.println("** Type 3: for Exit");
        System.out.print("\n Your Input: ");
        int selection  = menuInput.nextInt();

        switch (selection)
        {
            case 1: 
                getChecking();
                break;
            
            case 2: 
                getSavings();
                break;
            
            case 3:
                System.out.println("Thank you for using ATM management system. See you Later!."+"\n");
                break;
            default:
                System.out.println("Please enter valid choice!!!");
                break;
        }
    }

    public void getChecking()
    {
        System.out.println("\n-------------------------------------------------");
        System.out.println("**               CHECKING ACCOUNT            ** ");
        System.out.println("-------------------------------------------------");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Deposit Funds");
        System.out.println("Type 3: Widthdraw Funds");
        System.out.println("Type 4: Exit");

        System.out.print("Enter your choice: ");
        int selection  = menuInput.nextInt();

        switch (selection)
        {
            case 1: 
                System.out.println("Chechking account balance: "+  moneyformat.format(getCheckingBalance()));
                getChecking();
                break;
            
            case 2: 
                getChecking_DepositeInput();
                //getAccounttype();
                getChecking();
                break;
            
            case 3:
                getChecking_WidthdrawInput();
                //getAccounttype();
                getChecking();
                break;
                
            case 4: 
                System.out.println("Thank you for using ATM management system. See you Later."+"\n");
                getAccounttype();
                break;

            default:
                System.out.println("Please enter valid choice!!!");
                break;
        }

    }

    public void getSavings()
    {
        System.out.println("\n-------------------------------------------------");
        System.out.println("**               SAVINGS ACCOUNT            ** ");
        System.out.println("-------------------------------------------------");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Deposit Funds");
        System.out.println("Type 3: Widthdraw Funds");
        System.out.println("Type 4: Exit");

        System.out.print("Enter your choice: ");
        int selection  = menuInput.nextInt();

        switch (selection)
        {
            case 1: 
                System.out.println("Chechking account balance: "+  moneyformat.format(getSavingBalance()));
                //getAccounttype();
                getSavings();
                break;
            
            case 2: 
                getSavings_DepositeInput();
                //getAccounttype();
                getSavings();
                break;
            
            case 3:
                getSavings_WidthdrawInput();
                //getAccounttype();
                getSavings();
                break;
                
            case 4: 
                System.out.println("Thank you for using ATM management system. See you Later."+"\n");
                getAccounttype();
                break;

            default:
                System.out.println("Please enter valid choice!!!");
                break;
        }
    }

}