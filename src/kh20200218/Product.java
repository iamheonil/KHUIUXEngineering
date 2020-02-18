package kh20200218;

public class Product {

//	java07_inherit.product
//	class Product
//	---------------
//	# model : String
//	# price : int
//	---------------
//	<<constructor>>
//	+ product(String, int)
//
//	<<method>>
//	+ out() : void
//
//	<<getter>>
//	+ getModel() : String
//	+ getPrice() : int
//
//	<<setter>>
//	+ setModel(String) : void
//	+ setPrice(int) : void
	
	protected String model;
	protected int price;
	
	public Product() {
		 
	}
	
	public Product(String model, int price) {
		setModel(model);
		setPrice(price);
	}
	
	public void out() {
	
//		System.out.println("�𵨸� : " + model);
//		System.out.println("���� : " + price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
