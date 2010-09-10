package com.nazt;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a1 = new Human("AName", "ASurname");
		Student nat = new Student("Nat", "Weerawan", "4909660161");
		a1.introduce();
		nat.introduce();

		Shape[] shapes = new Shape[7];
		shapes[0] = new Circle();
		shapes[1] = new Square();
		shapes[2] = new Square();
		shapes[3] = new Square();
		shapes[4] = new Circle();
		shapes[5] = new Square();
		shapes[6] = new Circle();
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].printArea();
		}
	}

}
