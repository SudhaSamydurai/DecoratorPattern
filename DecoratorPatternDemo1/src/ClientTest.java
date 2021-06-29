
public class ClientTest {

	public static void main(String[] args) {
		
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n************");
		
		Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxurySportsCar.assemble();
	}

}
