package controller;

import javax.swing.JOptionPane;

import domain.MemberBean;

import service.MemberService;

import service.MemberServiceImpl;

public class Controller {

	public void start(){
		MemberBean memberBean = null;
		MemberService memberService = new MemberServiceImpl();
		
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.회원가입 2.회원목록" )) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료..");
				return;
			
			case "1":
				memberBean = new MemberBean();
				String id = JOptionPane.showInputDialog("아이디 입력");
				String name =JOptionPane.showInputDialog("이름 입력");
				String pass =JOptionPane.showInputDialog("비밀번호 입력");
				String ssn =JOptionPane.showInputDialog("주민번호 입력");
				memberService.createMember(id,name,pass,ssn);
				break;
				
			case "2":
				JOptionPane.showMessageDialog(null, memberBean.toString());
				break;
				
			default:
				break;
			}
		}
	}
}
