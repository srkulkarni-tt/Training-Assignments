
public class Checkout {
	public DessertItem dessertItems[];
	public int itemCount;
	public double totalCost;

	public Checkout() {
		this.dessertItems = new DessertItem[50];
		this.itemCount = 0;
	}

	public void enterDessertItem(DessertItem item) {
		this.dessertItems[itemCount++] = item;
	}

	public int totalItemCount() {
		return this.itemCount;
	}

	public double costOfAllItems() {
		for (int i = 0; i < dessertItems.length; i++) {
			this.totalCost += this.dessertItems[i].itemCost();
		}
		return this.totalCost;
	}

	@Override
	public String toString() {
		String output = "";
		
		return output;
	}

}
