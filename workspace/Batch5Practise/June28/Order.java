package June28;

public class Order {
	private int quantity;
	private double price;
	private double totalPrice;
	private String itemName;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {

		this.itemName = itemName;
	}
	
	
	public double CalculateTotalPrice(double totalPrice){
		totalPrice=quantity*price;
		return totalPrice;
	}
	
	public Order(){
		quantity=0;
		price=0.0;
		itemName="NA";
		
	}

	
}
