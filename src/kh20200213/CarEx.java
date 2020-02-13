package kh20200213;

/*
---------------
class Car
---------------
- model : String
- String color
---------------
<<constructor>>
+ Car(String,String)

<<method>>
+ display() : void

<<setter>>
+ setModel(String model) : void
+ setColor(String color) : void

<<getter>>
+ getModel() : String
+ getColor() : String
---------------
 */

class Car {
	private String model;
	private String color;

	public Car(String model, String color) {
		setModel(model);
		setColor(color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void display() {
		System.out.println(model);
		System.out.println(color);
	}
}

public class CarEx {
	public static void main(String[] args) {

		Car car = new Car("K5", "Black");
		car.display();

		System.out.println("----------");

		car.setModel("¸ð´×");
		car.setColor("White");

		System.out.println(car.getModel());
		System.out.println(car.getColor());

		System.out.println("----------");
		car.display();

	}
}
