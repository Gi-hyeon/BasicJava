package chapter11;

import java.util.Objects;

public class Member {
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	@Override  -> 1차적으로 검사할 때 전부 같다고 판단함
//	public int hashCode() {
//		return 0;
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member member = (Member) obj;
//		return id.equals(member.id);
		return Objects.equals(id, member.id); //사용하기 편하라고 만든 기능
	}
	
	
	
	
////	직접 작성할 필요는 없다.
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) { //super.equals(obj)
//			return true;
//		}
//		
//		if(!(obj instanceof Member)) {
//			return false;
//		}
//		
//		Member member = (Member)obj; //위에 확인 후 형변환
//		return id.equals(member.id);
//	}
}
