package service;

import domain.AccountBean;

/**
 * @author Lee Ji-Eun
 * @date 2018. 12. 26.
 * @desc 은행계좌 
 */
public interface AccountService{

	// create /findAll findSome findOne exist count /update /delete

	/**
	 * CREATE
	 */
	public void createAccount();

	public String makeAccountNum();

	/**
	 * READ
	 */
	public AccountBean[] findAll();

	public AccountBean[] findByMemberId(String id);

	public AccountBean findByAccountNum(String accountNum);

	public int countAccount();

	public boolean existAccountNum(String accountNum);

	public String info(String accountNum, String name, String today, int money); 

	public String findToday(); 

	/**
	 * UPDATE
	 */
	public String withdrawMoney(int money); 

	public String depositMoney(int money); 

	/**
	 * DELETE
	 */
	public void deleteAccountNum();
}
