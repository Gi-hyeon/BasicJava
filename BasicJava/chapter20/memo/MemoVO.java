package chapter20.memo;

import java.sql.Timestamp;

import com.oracle.webservices.internal.api.databinding.Databinding.Builder;

// VO: Value Object 값을 저장하는 객체
// DTO: Data Transfer Object 저장된 값을 전달하는 객체
// Bean: 자바가 커피원두에서 따온 이름이라 객체를 Bean으로 표현하기도 함
// Model: 데이터와 관련된 객체를 Model이라고 부르기도 함
// Item: 각각의 데이터를 표현하는 의미로 아이템이라고 부르기도 함
// JavaBeans 패턴 vs Builder 패턴
// 객체 선언 도구 => Lombok이 boilerplate code를 없애는 역할  
// sql과 1:1이 관계가 아니고 보여줄 데이터를 선언한 것이다. 테이블당 하나씩 만다는 것이 절대 아니다.
public class MemoVO {
	private int no;
	private String title;
	private String content;
	private String writer;
	private Timestamp registerDate;  //Date는 날짜만 가지고 옴, SQL Timestamp는 날짜와 시간을 가지고온다.
	private Timestamp modifyDate;
	
	public MemoVO(int no) {
		super();
		this.no = no;
	}

	public MemoVO(String title, String content, String writer) { //Insert할때는 3개의 매개변수만 있으면 된다.
		
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public MemoVO(int no, String title, String content, String writer) {  //Update할 때 사용한다.
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public MemoVO(int no, String title, String content, String writer, Timestamp registerDate, Timestamp modifyDate) {  //Select -> 데이터를 보여줄 때는 전부다 필요
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Timestamp getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s\n", no, title, content, writer, registerDate, modifyDate);
	}
}
