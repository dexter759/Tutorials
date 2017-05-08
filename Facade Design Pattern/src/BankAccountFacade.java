import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BankAccountFacade {
	
	private int accountNumber;
	
	private int securityCode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank welcomeToBank;
	
	public BankAccountFacade(int newAcctNum, int newSecCode){
		
		accountNumber = newAcctNum;
		securityCode = newSecCode;
		
		welcomeToBank = new WelcomeToBank();
		acctChecker= new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
		
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getSecurityCode() {
		return securityCode;
	}
	
	public void withdrawnCash(double cashToGet){
		
		if(acctChecker.accountActive(getAccountNumber()) && 
				codeChecker.isCodeCorrect(getSecurityCode())&&
				fundChecker.haveEnoughMoney(cashToGet)){
			
			System.out.println("Transaction Complete\n");
			
		}else{
			System.out.println("Transaction Faild\n");
		}
		
		
	}
	
	
	public void depositCash(double cashToDeposit){
		if(acctChecker.accountActive(getAccountNumber()) && 
				codeChecker.isCodeCorrect(getSecurityCode())){
				
				fundChecker.makeDeposit(cashToDeposit);
					
				System.out.println("Transaction Complete\n");
				
		}else{
			System.out.println("Transaction Faild\n");
		}
	}
}
