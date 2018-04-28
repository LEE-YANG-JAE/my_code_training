package chapter3;

public class Exec10VO {
	public Exec10VO() {}
	public Exec10VO(String price, String quantity, Double dprice, Double dquantity) {
		this.price = price;
		this.quantity = quantity;
		this.dprice = dprice;
		this.dquantity = dquantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Double getDprice() {
		return dprice;
	}
	public void setDprice(Double dprice) {
		this.dprice = dprice;
	}
	public Double getDquantity() {
		return dquantity;
	}
	public void setDquantity(Double dquantity) {
		this.dquantity = dquantity;
	}
	private String price = null;
	private String quantity = null;
	private Double dprice = null;
	private Double dquantity = null;
}
