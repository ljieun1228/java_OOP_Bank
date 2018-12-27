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

	public MemberServiceImpl() {
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
		return memberBeans;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int j = 0;
		for(int i = 0 ;i<count;i++){
			if(memberBeans[i].getName().equals(name)){
				j++;
			}
		}
		MemberBean[] beans = new MemberBean[j];
		j = 0;
	       for (int i = 0; i < count; j++) {
	            if (beans[j].getName().equals(name)) {
	            	memberBeans[j] = beans[i];
	                    j++;
	                    if(j == memberBeans.length) {
	                        
	                    }
	            }
	        }
		return memberBeans;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean memberBean = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (memberBeans[i].equals(id)) {
				memberBean = memberBeans[i];
			}
		}
		return memberBean;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean login = false;
		for (int i = 0; i < count; i++) {
			if (memberBeans[i].getId().equals(id) && memberBeans[i].getPass().equals(pass)) {
				login = true;
				break;
			}
		}
		return login;
	}

	@Override
	public int countMember() {
		return count;
	}

	/**
	 * UPDATE
	 */
	@Override
	public void updatePass(String id, String pass, String newpass) {
		for (int i = 0; i < count; i++) {
			if (existMember(id, pass)) {
				memberBeans[i].setPass(newpass);
				break;
			}
		}
	}

	/**
	 * DELETE
	 */
	@Override
	public void deleteMember(String id, String pass) {
		for (int i = 0; i < count; i++) {
			if (existMember(id, pass)) {
				memberBeans[i] = memberBeans[count - 1];
				memberBeans[count - 1] = null;
				count--;
				break;
			}
		}
	}
}
