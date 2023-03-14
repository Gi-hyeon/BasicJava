package sec06.exam03.package2;

class Printer{
	void println(int i){
		System.out.println(i);
	}
	void println(boolean i){
		System.out.println(i);
	}
	void println(double i){
		System.out.println(i);
	}
	void println(String i){
		System.out.println(i);
	}
}

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
