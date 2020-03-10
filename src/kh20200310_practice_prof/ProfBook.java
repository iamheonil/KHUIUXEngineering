package kh20200310_practice_prof;

public class ProfBook {
	private String bNo;	//������ȣ
	private int category;	//�����з��ڵ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ)
	private String title;	//å����
	private String author;	//����
	
	public ProfBook() { }

	public ProfBook(String bNo, int category, String title, String author) {
		setbNo(bNo);
		setCategory(category);
		setTitle(title);
		setAuthor(author);
	}
	
	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
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
}
