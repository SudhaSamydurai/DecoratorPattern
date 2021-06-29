package ClientTest;
import DecoratorToppings.FreshTomatoTopping;
import DecoratorToppings.PaneerTopping;
import PizzaType.Margherita;
import PizzaType.PeppyPaneer;
import PizzaType.Pizza;

public class PizzaStore {

	public static void main(String[] args) {
		Pizza pizza = new PeppyPaneer();
		System.out.println(pizza.getDescription() + " Cost is "+pizza.getCost());
		
		Pizza pizzaWithToppings = new Margherita();
		pizzaWithToppings = new FreshTomatoTopping(pizzaWithToppings);
		pizzaWithToppings = new PaneerTopping(pizzaWithToppings);
		
		System.out.println(pizzaWithToppings.getDescription() + " Cost is "+pizzaWithToppings.getCost());

	}

}
