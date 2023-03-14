package sabstract;

abstract class ContentSender{
	String title;
	String nm;
	
	public ContentSender(String title, String nm) {
		super();
		this.title = title;
		this.nm = nm;
	}
	
	public abstract void sendMsg(String content);
}

class KakaoSender extends ContentSender{
	String content;

	public KakaoSender(String title, String nm, String content) {
		super(title, nm);
		this.content = content;
	}
	
	@Override
	public void sendMsg(String recipient) {
		// TODO Auto-generated method stub
		System.out.println("제목: " + this.title);
		System.out.println("이름: " + this.nm);
		System.out.println("내용: " + this.content);
		System.out.println("받는 사람: " + recipient);
	}
}

class LetterSender extends ContentSender{
	String content;

	public LetterSender(String title, String nm, String content) {
		super(title, nm);
		this.content = content;
	}
	
	@Override
	public void sendMsg(String recipient) {
		// TODO Auto-generated method stub
		System.out.println("제목: " + this.title);
		System.out.println("이름: " + this.nm);
		System.out.println("내용: " + this.content);
		System.out.println("받는 사람: " + recipient);
	}
}

public class SenderEx {
	public static void main(String[] args) {
		LetterSender cs1 = new LetterSender("SMS문자", "서수진", "1달러");
		cs1.sendMsg("기현");
		
		KakaoSender cs2 = new KakaoSender("카톡문자", "김기현", "100달러");
		cs2.sendMsg("받기현");
		
	}
}
