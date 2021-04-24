package Exe4;

public class RedApple extends Apple {

	private double carbohydrate;
	private int calcium;
	private double vitaminE;
	private String type;
	
	public RedApple(String name, int p, int q, double cb, int ca, double v, String t) {
		super(name, p, q);
		this.carbohydrate = cb;
		this.calcium = ca;
		this.vitaminE = v;
		this.type = t;
	}

	public String toString() {
		return super.toString() + "\nType\t\t: " + type + "\nCarbohydrate\t: " + carbohydrate + " g" + "\nCalcium\t\t: " + calcium + " mg" + "\nVitamin E\t: " + vitaminE + " mg";
	}
}