
public abstract class DessertItem {
	String dessertName;

	public DessertItem() {
		this.dessertName = null;
	}

	public DessertItem(String name) {
		this.dessertName = name;
	}

	public abstract double itemCost();

	public final String itemName() {
		return this.dessertName;
	}
}
