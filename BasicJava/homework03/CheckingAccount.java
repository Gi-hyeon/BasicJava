package homework03;

public class CheckingAccount extends BankAccount{
	private SavingsAccount protectedBy;
	
	@Override
	String getAccountType() {
		// TODO Auto-generated method stub
		return "당좌예금";
	}
	
	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	@Override
	public boolean withdraw(int amount) {
//		 TODO Auto-generated method stub
//		S: 10000 C: 5000 -> 2000원의 수표 발행, 7000원의 수표 발행, 17000원 수표 발행  각자의 사건을 어떻게 처리할지 고민
		
		
//		if(!protectedBy.withdraw(amount - balance)) {   --고민해보기
//			return false;
//		}
		
		if(super.withdraw(amount)) {
			return true;
		} else {
			if(protectedBy.withdraw(amount - balance)) {
				balance = 0;
				return true;
			} else {
				return false;
			}
		}
		
//		if(super.withdraw(amount)) {   //부모 withdraw 조건때문에 이렇게 써도 가능
//			return true;
//		}
//		protectedBy.balance -= amount - balance;
//		balance = 0;
//		return true;
		
		
		
		
//		---본인 작성
//		if(balance - amount > 0 ) {
//			balance -= amount;
//			return true;
//		} else {
//			protectedBy.withdraw(amount - balance);
//			balance -= balance;
//			return true;
//		}
		
	}
}
