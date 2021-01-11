package view;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요 UMS 프로그램 입니다.");
		while(true) {
			System.out.println("1. 회원가입\n2. 로그인\n3. 아이디/비밀번호 찾기\n4. 나가기");
			int choice=sc.nextInt();
			if(choice==4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			//컨트롤러 역할(알맞은 View 생성자로 호출)
			switch(choice) {
			case 1:
				//회원가입
				new Join();
				break;
			case 2:
				//로그인
//				new Login();
				new LoginWindow();
				break;
			case 3:
				//아이디/비밀번호 찾기
				new FindIdPw();
				break;
			}
		}
		
	}
}



