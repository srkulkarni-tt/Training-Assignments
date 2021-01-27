
public class IceCream extends DessertItem {

	double icecreamCost;

	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public IceCream(double cost) {
		this.icecreamCost = cost;
	}

	@Override
	public double itemCost() {
		return this.icecreamCost;
	}

}
