package Exe4;

public class Apple extends Fruit {
	private int price;
	private int quantity;
	
	public Apple(String name, int p, int q){
		super(name);
		this.price = p;
		this.quantity = q;
	
	//System.out.println(name + " constructor is invoked");
	}
	
	public int calPrice() {
		return this.quantity*this.price;
	}
	
	public String toString() {
		return super.toString() + "\nPrice\t\t: RM" + price+ "\nQuantity\t: " +quantity;
	}
}
