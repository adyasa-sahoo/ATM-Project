package ATM;
import java.io.IOException;
import java.text.DecimalFormat; 
import java.util.HashMap;
import java.util.Scanner;

public class ATM_app extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
	HashMap<Integer ,Integer> data =new HashMap<Integer , Integer>();
	
	public void getlogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(952141,191904);
				data.put(989947,71976);
				System.out.println("welcome to the ATM project!");
				System.out.println("Enter your customer Number");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter your PIN Number:" );
				setPinNumber(menuInput.nextInt());
				
			}catch(Exception e) {
				System.out.println("\n" + "Invalid Character(s).Only Numbers." +"\n");
				x=2;
			}
				int cn=getCustomerNumber();
				int pn=getPinNumber();
				if(data.containsKey(cn) && data.get(cn)==pn) {
					getAccountType();
				}else {
					System.out.print("\n" +"wrong customer number or pin number" +"\n");
				}
					
			}while(x==1);
		}
	public void getAccountType() {
		System.out.println("Select the account you want to access:");
		System.out.println("Type 1-Checking Account");
		System.out.println("Type 2-saving Account");
		System.out.println("Type 1-Exit");
		
		int selection =menuInput.nextInt();
		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("thank you");
			break;
		default:
			System.out.println("\n"+"Invalid"+"\n");
		}
	}
	public void getChecking() {
		System.out.println("Checking account:");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds");
		System.out.println("Type 4-Exit");
		System.out.print("choice");
		
		int selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("checking Account Balancing:"+ moneyFormat.format("getChecking("));
			getAccountType();
		
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("thank you");
			break;
		default:
			System.out.println("invalid");
		
	}
	}
	public void getSaving() {
		System.out.println("Saving account:");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds");
		System.out.println("Type 4-Exit");
		System.out.print("choice");
		
		int selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("checking Account Balancing:"+ moneyFormat.format("getSaving("));
			getAccountType();
		
		case 2:
			getsavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("thank you");
			break;
		default:
			System.out.println("invalid");
		}

	}

}
