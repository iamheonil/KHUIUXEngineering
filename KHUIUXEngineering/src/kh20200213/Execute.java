package kh20200213;

public class Execute {
	public static void main(String[] args) {
				
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo(); //이름과 나이 입력
		
		ss.insertScore(); //국영수 점수 입력
		
//		ss.calcSum();
//
//		ss.calcAvg();
		
		ss.printStu(); //학생 정보 출력
		
	}
}
