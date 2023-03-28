package department;

public class Products {
	private String productName;
	private int productCost;
	private int productQuantity;
	public Products(String productName, int productCost, int productQuantity) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.productQuantity = productQuantity;
	}
	
	@Override
	public String toString() {
		return "Products [productName=" + productName + ", productCost=" + productCost + ", productQuantity="
				+ productQuantity + "]";
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


}
