package homework03;

public class Poet extends Book{

	public Poet(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getLateFee(int fee) {
		// TODO Auto-generated method stub
		return fee * 200;
	}
}
