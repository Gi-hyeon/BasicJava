package lifecoding;

class Service{
	public Service() {
		System.out.println("로그인");
	}
}

class MemberService extends Service{
	public MemberService() {
		System.out.println("멤버 로그인");
	}
}

class AService extends MemberService{
	public AService() {
		System.out.println("A로그인");
	}
}

public class ServiceExample {
	public static void main(String[] args) {
		AService aService = new AService();
	}
}
