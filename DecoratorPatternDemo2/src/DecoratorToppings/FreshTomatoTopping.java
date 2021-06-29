package DecoratorToppings;
import PizzaType.Pizza;

public class FreshTomatoTopping extends PizzaDecorator{

	Pizza pizza;
	
	public FreshTomatoTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.description+ ", Fresh Tomato";
	}

	@Override
	public int getCost() {
		return 40 + pizza.getCost();
	}

}
