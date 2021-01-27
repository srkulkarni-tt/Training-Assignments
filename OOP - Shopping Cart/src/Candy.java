
public class Candy extends DessertItem {
	double candyWeight;
	double candyPrice;
	double finalCandyPrice;

	public Candy() {
		// Check if this is of any use ahead
	}

	public Candy(double weight, double price) {
		this.candyWeight = weight;
		this.candyPrice = price;
	}

	@Override
	public double itemCost() {
		this.finalCandyPrice = (this.candyWeight * 0.001) * this.candyPrice;
		return this.finalCandyPrice;
	}

}
