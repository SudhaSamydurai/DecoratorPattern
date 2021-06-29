package DecoratorToppings;
import PizzaType.Pizza;

public class PaneerTopping extends PizzaDecorator {
	Pizza pizza;
	
	public PaneerTopping(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,Paneer ";
	}

	@Override
	public int getCost() {
		return 70+pizza.getCost();
	}
	
	
}
