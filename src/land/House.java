package land;

public class House extends Building {

	public House() {

		sizeSqMeter = 200;
		floors = 2;
		costInDollar = 200000;
		typeOfBuilding = "House";

	}

	public void methodInsideHouse() {
		System.out.println("Hello, inside the house!");
	}

}
