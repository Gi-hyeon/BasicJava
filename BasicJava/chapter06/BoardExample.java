package chapter06;

class Board{
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
		this(title, content, null, null, 0);
	}
	
	Board(String title, String content, String writer){
		this(title, content, writer, null, 0);
	}
	
	Board(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}

public class BoardExample {
	public static void main(String[] args) {
		Board board1 = new Board("title", "content");
		Board board2 = new Board("title", "content", "writer");
		Board board3 = new Board("title", "content", "writer", "date");
		Board board4 = new Board("title", "content", "writer", "date", 0);
		
		
		
	}
}
