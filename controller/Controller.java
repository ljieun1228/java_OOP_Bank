package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

public class Controller {

	public void start() {
		MemberBean memberBean = null;
		AccountBean accountBean = null;
		MemberService memberService = new MemberServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n" 
					+ "2.회원목록\n" 
					+ "3.이름검색\n" 
					+ "4.ID 검색\n"
					+ "5.회 원 수\n" 
					+ "6.로 그 인\n" 
					+ "7.비밀번호 변경\n" 
					+ "8.회원탈퇴\n" 
					+ "9.계좌생성\n "
					+ "10.전체 계좌 조회\n "
					+ "11.출금"
					+ "12.입금"
					+ "13.삭제\n")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료..");
				return;
			case "1":
				memberBean = new MemberBean();
				String id = JOptionPane.showInputDialog("아이디 입력");
				String name = JOptionPane.showInputDialog("이름 입력");
				String pass = JOptionPane.showInputDialog("비밀번호 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				memberService.createMember(id, name, pass, ssn);
				break;

			case "2":
				JOptionPane.showMessageDialog(null, memberService.findAllMember());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, memberService.findByName(JOptionPane.showInputDialog("검색할 이름 입력")));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, memberService.findById(JOptionPane.showInputDialog("검색할 아이디 입력")));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, memberService.countMember() + "명");
				break;
			case "6":
				if (memberService.existMember(JOptionPane.showInputDialog("로그인 아이디 입력"),
						JOptionPane.showInputDialog("로그인 비밀번호 입력"))) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
				break;
			case "7":
				memberService.updatePass(JOptionPane.showInputDialog("비밀번호 변경할 아이디 입력"),
						JOptionPane.showInputDialog("비밀번호 입력"), JOptionPane.showInputDialog("새로운 비밀번호 입력"));
				break;
			case "8":
				memberService.deleteMember(JOptionPane.showInputDialog("탈퇴할 아이디 입력"),
						JOptionPane.showInputDialog("비밀번호 입력"));
				break;
			case "9":// 계좌생성
				accountBean = new AccountBean();
				accountService.createAccount(Integer.parseInt(JOptionPane.showInputDialog("초기 입금액 입력")));

				break;
			case "10":// 전체 계좌조회
				JOptionPane.showMessageDialog(null, accountService.findAll());
				break;
			case "11":// 출금
				JOptionPane.showMessageDialog(null, accountService.withdrawMoney
						(JOptionPane.showInputDialog("출금할 계좌번호 입력"),
						Integer.parseInt(JOptionPane.showInputDialog("출금할 금액 입력"))));
				break;
			case "12":// 입금
				JOptionPane.showMessageDialog(null, accountService.depositMoney
						(JOptionPane.showInputDialog("입금할 계좌번호 입력"),
						Integer.parseInt(JOptionPane.showInputDialog("입금할 금액 입력"))));
				break;
			case "13":// 삭제
				accountService.deleteAccountNum(JOptionPane.showInputDialog("삭제할 계좌번호 입력"));
				break;
				
			case "100": //테스트계좌 생성
				for(int i =100;i<105;i++){
					accountService.createAccount(i);
				}
				break;
			default:
				break;
			}
		}
	}
}
