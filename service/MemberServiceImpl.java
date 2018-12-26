package service;

import domain.MemberBean;

/**
 * @author Lee Ji-Eun
 * @date 2018. 12. 26.
 * @desc 멤버기능 구현 객체
 */
public class MemberServiceImpl implements MemberService {

	private MemberBean[] memberBeans;
	private int count;

	void MemberServiceImpl() {
		this.memberBeans = new MemberBean[10];
		this.count = 0;
	}

	/**
	 * CREATE
	 */
	@Override
	public void createMember(String id, String name, String pass, String ssn) {
		MemberBean memberBean = new MemberBean();
		memberBean.setId(id);
		memberBean.setName(name);
		memberBean.setPass(pass);
		memberBean.setSsn(ssn);
		memberBeans[count] = memberBean;
		count++;
		}


	/**
	 * READ
	 */
	@Override
	public MemberBean[] findAllMember() {
		// TODO Auto-generated method stub
		return memberBeans;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existMember() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * UPDATE
	 */
	@Override
	public void updatePass(String id, String pass, String newpass) {
		// TODO Auto-generated method stub

	}

	/**
	 * DELETE
	 */
	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

}
