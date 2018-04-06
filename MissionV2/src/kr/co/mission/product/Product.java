package kr.co.mission.product;

public class Product {
	private String name;
	private int price;	
	public Product() {}
	
	public Product(String name, int price) {
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
	
	@Override
	public String toString() {
		return String.format("%s\t%,d원", getName(), getPrice());
	}
}
