package kh202003.kh20200310_practice_prof;

//BookManagerMap의 인터페이스
//멤버 메소드들에 대한 설명을 자세히 작성해둠
public interface ProfBookManagerMapInterface {

	/**
	 * 새 도서 추가
	 * 	맵에 새로운 도서를 추가한다
	 * 
	 * @param book - Book, 새롭게 추가할 책 정보를 담고있는 객체
	 */
	public void putBook(ProfBook book);
	
	
	
	/**
	 * 도서 삭제
	 * 	책 번호를 전달받아 맵에서 도서 정보를 삭제한다
	 * 
	 * @param bNo - String, 삭제할 도서의 이름 
	 */
	public void removeBook(String bNo);
	
	
	
	/**
	 * 도서 정보 검색
	 * 	책 이름을 전달받아 해당 책의 책번호를 반환한다
	 *	존재하지 않는 책이라면 null을 반환한다
	 * 
	 * @param bTitle - String, 검색하려는 책 이름
	 * @return
	 * 	String - 검색된 책번호
	 * 	null - 검색된 책 정보가 존재하지 않을 때
	 */
	public String searchBook(String bTitle);
	
	
	
	/**
	 * 모든 책의 정보를 출력한다
	 * 	printBook() 활용
	 *  
	 */
	public void displayAll();
	
	
	
	/**
	 * 책 한권의 정보를 출력한다
	 * 
	 * @param bNo - String, 출력하려는 책의 책번호
	 */
	public void printBook(String bNo);
	
}
