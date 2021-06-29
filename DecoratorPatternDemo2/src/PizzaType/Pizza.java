package PizzaType;

public abstract class Pizza {

	public String description ="Unknown Pizza";
	
	public String getDescription() {
		return description;
	}
	
	public abstract int getCost();
}
