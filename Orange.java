package Exe4;

public class Orange extends Fruit {
	private int price;
	private int quantity;
	private String brand;
	
	public Orange(String name, int p, int q, String b){
		super(name);
		this.price = p;
		this.quantity = q;
		this.brand = b;
	
	//System.out.println(name + " constructor is invoked");
	}
	
	public int calPrice() {
		return this.quantity*this.price;
	}
	public String toString() {
		return super.toString() + "\nBrand\t\t: " + brand + "\nPrice\t\t: RM" + price + "\nQuantity\t: " +quantity;
	}
} 


