
public class TestBankAccount {
	
	public static void main(String[]args){
		BankAccountFacade accessingBank = new BankAccountFacade(12345678,1234);
		
		accessingBank.withdrawnCash(50.00);
		
		accessingBank.withdrawnCash(900.00);
		
		accessingBank.depositCash(200.00);
	}
	
}
