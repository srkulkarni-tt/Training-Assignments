
public class Cookie extends DessertItem {

	int cookieCount;
	double cookiePPD;
	double cookieCost;

	public Cookie() {
		this.cookieCount = 0;
		this.cookiePPD = 0;
		this.cookieCost = 0;
	}

	public Cookie(int count, double ppd) {
		this.cookieCount = count;
		this.cookiePPD = ppd;
	}

	@Override
	public double itemCost() {
		this.cookieCost = (int) (this.cookieCount * (this.cookiePPD / 12));
		return this.cookieCost;
	}

}
