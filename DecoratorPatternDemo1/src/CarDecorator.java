
public class CarDecorator extends BasicCar {

	protected Car car;
	
	public CarDecorator(Car car){
		this.car = car;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}
}
