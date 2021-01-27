
public class TestCheckout {

	public static void main(String[] args) {
		Checkout checkout = new Checkout();

		checkout.enterDessertItem(new Candy(20, 50));
		checkout.enterDessertItem(new Cookie(5, 25));
		checkout.enterDessertItem(new IceCream(100));
		checkout.enterDessertItem(new Sundae(250));

		System.out.println("Items: " + checkout.totalItemCount());
		System.out.println("Total cost: " + checkout.costOfAllItems());
	}

}
