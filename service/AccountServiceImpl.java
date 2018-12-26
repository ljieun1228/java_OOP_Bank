package service;

import domain.AccountBean;
import domain.MemberBean;

/**
 * @author Lee Ji-Eun
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현 객체
 */
public class AccountServiceImpl implements AccountService {

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String makeAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findByMemberId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String info(String accountNum, String name, String today, int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findToday() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String withdrawMoney(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String depositMoney(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccountNum() {
		// TODO Auto-generated method stub
		
	}



}
