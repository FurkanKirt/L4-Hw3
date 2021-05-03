package entities;

public class Campaign {
	int id;
	String description;
	double discoundRate;
	double price;
	double discoundprice;
	public Campaign() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDiscoundRate() {
		return discoundRate;
	}
	public void setDiscoundRate(double discoundRate) {
		this.discoundRate = discoundRate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscoundprice() {
		return this.price-(this.price*this.discoundRate/100);
	}
	

	
}
