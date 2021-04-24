package Exe4;

import Exe3_2.Boat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit f1 = new Fruit("FRUIT");
		System.out.println(f1);
		System.out.println();
		
		Apple a1 = new Apple("APPLE", 10, 5);
		System.out.println(a1);
		System.out.println("Total price\t: RM" + a1.calPrice());
		System.out.println();
		
		Orange o1 = new Orange("ORANGE", 10, 5, "Navel");
		System.out.println(o1);
		System.out.println("Total price\t: RM" + o1.calPrice());
		System.out.println();
		
		Kiwi k1 = new Kiwi("KIWI", 11, 5, "Zespri");
		System.out.println(k1);
		System.out.println("Total price\t: RM" + k1.calPrice());
		System.out.println();
		
		RedApple r1 = new RedApple("Red Apple", 11, 5, 14.06, 6, 0.24, "Fuji");
		System.out.println(r1);
		System.out.println("Total price\t: RM" + r1.calPrice());
		System.out.println();
		
		GreenApple g1 = new GreenApple("Green Apple", 10, 5, 58, 2.8, 0.15, "Pippin");
		System.out.println(g1);
		System.out.println("Total price\t: RM" + g1.calPrice());
		System.out.println();
		
		int totalS = (a1.calPrice()+o1.calPrice()+k1.calPrice()+r1.calPrice()+g1.calPrice());
		System.out.println("Total price need to be paid: RM" + totalS);

	}

}
