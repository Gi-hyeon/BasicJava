package chapter06;

class FruitSeller {
	int numOfApple;
	int myMoney;
	int applePrice;
	
	public FruitSeller(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		applePrice = price;
	}
}

public class FruitSalesMain03 {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(100, 200, 2000);
		FruitSeller seller2 = new FruitSeller(400, 800, 1600);
		System.out.println(seller2.myMoney);
	}
}
