package kh20200310_practice2;

public class Book {

//	//Field
//	- bNo : String		//������ȣ
//	- category : int	//�����з��ڵ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ)
//	- title : String	//å����
//	- author : String	//����
//
//	//�⺻������, �Ű����� �ִ� ������, getters and setters �ۼ���
//	//toString() �������̵���

	private String bNo;
	private int category;
	private String title;
	private String author;
	
	
	
	public String getbNo() {
		return bNo;
	}


	public void setbNo(String bNo) {
		this.bNo = bNo;
	}


	public int getCategory() {
		return category;
	}


	public void setCategory(int category) {
		this.category = category;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return bNo + " -> " + "[å ��ȣ = " + bNo + ", ī�װ� = " + category + ", å ���� = " + title + ", �۾��� = " + author + "]";
		
	}


	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	
	
}
