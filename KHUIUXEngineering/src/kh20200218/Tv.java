package kh20200218;

public class Tv extends Product {

//	---------------
//	- model : String
//	- price : int
//	---------------
//	<<constructor>>
//	+ Tv(String, int)
//
//	<< method >>
//	+ out() : void {override}
//	  --> "TV" ��� ���
//
//	<<getter>>
//	+ getModel() : String
//	+ getPrice() : int
//
//	<<setter>>
//	+ setModel(String) : void
//	+ setPrice(int) : void

	
	
//	private String model;
//	private int price;
	
			
	public Tv(String model, int price) {
//		setModel(model);
//		setPrice(price);
		
		super(model, price);

	}
	
	// String model, int price
	
	@Override
	public void out() {
//		System.out.println("TV\n" + getModel());
		System.out.println("�𵨸� : " + model);
		System.out.println("���� : " + price);
	}

//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	
}
