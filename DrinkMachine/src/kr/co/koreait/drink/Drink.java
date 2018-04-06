package kr.co.koreait.drink;

public class Drink {
	String name;
	int price;
	
	public Drink(String name, int price) {
		setPrice(price);
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {		
		return price;
	}
	
	protected void setPrice(int price) {
		if(price < 0)
			return;
		this.price = price;
	}
}