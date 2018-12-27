package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;
/**
 * @author Lee Ji-Eun
 * @date 2018. 12. 27.
 * @desc 
 */
public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;

	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	/********************************************************************************************
	 * CRATE
	 *******************************************************************************************/
	@Override
	public void createAccount(int money) {

		AccountBean account = new AccountBean();

		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(findToday());
		list.add(account);
	}

	@Override
	public String createAccountNum() {
		String accountNum = "";
		Random random = new Random();

		for (int i = 0; i < 2; i++) {
			if (i == 3) {
				accountNum += random.nextInt(10) + "-";
			} else {
				accountNum += random.nextInt(10);
			}
		}
		return accountNum;
	}

	/********************************************************************************************
	 * READ
	 *******************************************************************************************/
	@Override
	public ArrayList<AccountBean> findAll() {
		return list;
	}

	@Override
	public AccountBean findAccountByMemberId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
			}
		}
		return account;
	}

	@Override
	public int countAccount() {
		return list.size();
	}

	@Override
	public String info(String accountNum, String name, String today, int money) {
		return String.format("계좌번호:%s \n 이름:%s\n 계좌발급일:%s\n 금액:%n", accountNum, name, today, money);
	}

	@Override
	public String findToday() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		today = sdf.format(date);
		return today;
	}

	/********************************************************************************************
	 * UPDATE
	 *******************************************************************************************/
	@Override
	public String withdrawMoney(String accountNum, int money) {
		String msg = "";
		for(int i =0;i<list.size();i++){
			if(list.get(i).getAccountNum().equals(accountNum)&& list.get(i).getMoney() > money){
				int restMoney = list.get(i).getMoney();
				restMoney -= money;
				list.get(i).setMoney(restMoney);
				msg = "출금이 완료되었습니다.";
				break;
			}else{
				msg = "계좌번호가 다르거나 잔고가 부족합니다";
			}
		}
		return msg;
	}

	@Override
	public String depositMoney(String accountNum, int money) {
		String msg = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)&& money > 0) {
				int restMoney = list.get(i).getMoney();
				restMoney += money;
				list.get(i).setMoney(restMoney);
				msg = "입금이 완료되었습니다.";
				break;
			} else {
				msg = "계좌번호가 다르거나 입금액이 잘못되었습니다.";
			}
		}
		return msg;
	}

	/********************************************************************************************
	 * DELETE
	 *******************************************************************************************/

	@Override
	public void deleteAccountNum(String accountNum) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				list.remove(i);
			}
		}
	}
}
