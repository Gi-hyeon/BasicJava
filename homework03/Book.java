package homework03;

import java.util.Objects;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	static private int countOfBooks;  //static 생략 시 각각 초기화되기 때문에 1번이다. 공통으로 관리한다.
	
	public Book(String title, String author){
		super();
		this.title = title;
		this.author = author;
		this.number = countOfBooks++;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFee(int fee);
	
	public boolean equals(Object object) {// Object object = new Book("책1", "작가1");
//		if(object instanceof Book) {
//			Book book = (Book)object;
//			return title == book.title && author == book.author;
//		} else {
//			return false;
//		}
		
		
//		------------------------- 답안 ------------------
//		1. 먼저 주소가 같으면 같은 객체
		if(this == object) {
			return true;
		}
//		2. title과 author가 같으면 같은 객체
		if(!(object instanceof Book)) {
			return false;
		}
		Book book = (Book)object;
		return title.equals(book.title) && author.equals(book.author);
//		return Objects.equals(title, book.title) && Objects.equals(author, book.author);
		
		
	}
	
//	hashcode()?
	
	public int hashCode() {
		return hashCode();
//		2가지 방법이 있음
//		return title.hashCode() + author.hashCode();  
//		return Objects.hash(title, author);
	}

	
	
	@Override
	public String toString() {
		return "관리번호 " + (getNumber()+1) +"번, 제목:" + title + ", 작가: " + author + "(일주일 연체료: " + getLateFee(7) + "원)";
	}
	
	
	
}
