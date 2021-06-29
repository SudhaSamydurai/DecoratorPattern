
public class SportsCar extends CarDecorator {

	public SportsCar(Car car){
		super(car);
	}
	
	@Override
	public void assemble() {
		System.out.print("Sport car version");
	}
}
