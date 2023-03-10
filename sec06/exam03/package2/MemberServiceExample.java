package sec06.exam03.package2;

class MemberService{
	String id;
	String password;
	
	boolean login(String id, String password) {
		if("hong".equals(id) && password.equals("12345")) {    //문자열을 앞에 쓰는 게 더 안전 <- 오류 안뜸 , 문자열 뒤에 쓰면 nullpoint exception
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id){
		System.out.println("로그아웃 되었습니다.");
	}
}

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login(null, "1234");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
