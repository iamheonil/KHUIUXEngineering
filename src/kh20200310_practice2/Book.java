package kh20200310_practice2;

public class Book {

//	//Field
//	- bNo : String		//도서번호
//	- category : int	//도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
//	- title : String	//책제목
//	- author : String	//저자
//
//	//기본생성자, 매개변수 있는 생성자, getters and setters 작성함
//	//toString() 오버라이딩함

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
		return bNo + " -> " + "[책 번호 = " + bNo + ", 카테고리 = " + category + ", 책 제목 = " + title + ", 글쓴이 = " + author + "]";
		
	}


	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	
	
}
