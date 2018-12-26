package domain;

public class AccountBean {

	private String accountNum, today;
	private int money;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getMoney() {
		return accountNum;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("계좌번호:%s 계좌발급일:%s 잔고:%n ", accountNum, today, money);
	}
}
