package kh20200310_practice_prof;

public class ProfBook {
	private String bNo;	//도서번호
	private int category;	//도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	private String title;	//책제목
	private String author;	//저자
	
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
