package lifecoding;

class Won extends Money{
	private String country = "Korea";
	@Override
	public String getCountry() {
		
		return country;
	}
}

class Euro extends Money{
	private String country = "Spain";
	@Override
	public String getCountry() {
		
		return country;
	}
}


public class Money {
	public String county = "unknown";
	public String getCountry() {
		return county;
	}
	
	public static void main(String[] args) {
		Won won = new Won();
		Euro euro = new Euro();
		Money money = new Won();
		// 필드는 왼쪽, 내용물은 오른쪽이 중요하다.
		
		System.out.println(won.getCountry());
		System.out.println(euro.getCountry());
		System.out.println(money.county);
	}
}

