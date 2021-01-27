
public class Sundae extends IceCream {
	double toppingCost;
	double sundaeCost;

	public Sundae() {

	}

	public Sundae(double cost) {
		this.toppingCost = cost;
	}

	public double itemCost() {
		this.sundaeCost = super.itemCost() + this.toppingCost;
		return this.sundaeCost;
	}
}
