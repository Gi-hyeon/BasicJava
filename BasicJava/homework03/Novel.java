package homework03;

public class Novel extends Book {

	public Novel(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	} 
	
	@Override
	public int getLateFee(int fee) {
		// TODO Auto-generated method stub
		return fee * 300;
	}
}
