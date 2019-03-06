
public class ProductMain {

	public static void main(String[] args) {
		Fruit apple = new Fruit("Apple", 100000001, 
				"A round fruit of a tree of the rose family, which typically has thin red or green skin and crisp flesh.",
				0.10, 55, "Red");
		Fruit car = new Fruit("Ferrari", 100900001, 
                "An expensive road vehicle, typically with four wheels, powered by an internal combustion engine",
                50000000, 2, "Blue");

		System.out.println(apple.toString());
		System.out.println(car.toString());
	}

}
