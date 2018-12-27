package service;

import domain.MemberBean;
/**
 * @author Lee Ji-Eun
 * @date 2018. 12. 26.
 * @desc 멤버 서비스  
 */
public interface MemberService {
	
	// create /findAll findSome findOne exist count /update /delete

	public void createMember(String id, String name, String pass, String ssn);

	public MemberBean[] findAllMember();

	public MemberBean[] findByName(String name);

	public MemberBean findById(String id);

	public boolean existMember(String id, String pass);

	public int countMember();

	public void updatePass(String id, String pass, String newpass);

	public void deleteMember(String id, String pass);

}
