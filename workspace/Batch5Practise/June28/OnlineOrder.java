package June28;

public final class OnlineOrder extends Order {
	private double shippingRate;
	
	@Override
	public double CalculateTotalPrice(double totalPrice) {
		return getQuantity() * getPrice() + (shippingRate * getQuantity());
	}

	public double CalculateTotalPrice(boolean freeshipping) {
		if (freeshipping) {
			return getQuantity() * getPrice();
		} else {
			return getQuantity() * getPrice() + (shippingRate * getQuantity());
		}
	}
}s
