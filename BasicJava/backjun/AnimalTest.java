package backjun;

abstract class Animal{
	public String toString() {
		return "Animal";
	}
}

class Birds extends Animal{
	@Override
	public String toString() {
		return "Birds";
	}
}

class Eagles extends Birds{
	@Override
	public String toString() {
		return "Eagles";
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Birds b = new Birds();
		System.out.println(b);
		
		Birds b1 = new Eagles();
		System.out.println(b1);
		
		Animal a = b;
		System.out.println(a);
	}
}
