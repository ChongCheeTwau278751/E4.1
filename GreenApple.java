package Exe4;

public class GreenApple extends Apple {

	private int calorie;
	private double fiber;
	private double iron;
	private String type;
	
	public GreenApple(String name, int p, int q, int c, double f, double i, String t) {
		super(name, p, q);
		this.calorie = c;
		this.fiber = f;
		this.iron = i;
		this.type = t;
		
	}

	public String toString() {
		return super.toString() + "\nType\t\t: " + type + "\nCalorie\t\t: " + calorie + " kcal" + "\nFiber\t\t: " + fiber + " g" + "\nIron\t\t: " + iron + " mg";
	}
}
