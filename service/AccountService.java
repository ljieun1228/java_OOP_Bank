package service;

import java.util.ArrayList;

import domain.AccountBean;

/**
 * @author Lee Ji-Eun
 * @date 2018. 12. 26.
 * @desc 은행계좌 
 */
public interface AccountService{


	/**
	 * CREATE
	 */
	public void createAccount(int money);
	 
	public String createAccountNum(); // 계좌번호 생성
	

	/**
	 * READ
	 */
	public ArrayList<AccountBean> findAll();

	public AccountBean findAccountByMemberId(String id);

	public AccountBean findByAccountNum(String accountNum);

	public int countAccount();

	public String info(String accountNum, String name, String today, int money); 

	public String findToday(); 

	
	/**
	 * UPDATE
	 */
	public String withdrawMoney(String accountNum, int money); 

	public String depositMoney(String accountNum, int money); 

	/**
	 * DELETE
	 */
	public void deleteAccountNum(String accountNum);
}
