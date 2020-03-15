package kh202002.kh20200211_method;



// 실행 클래스

public class ProfMethod_04Ex {
	public static void main(String[] args) {

		ProfMethod_04 pm = new ProfMethod_04();
		
		int[] arr = {11, 22, 33, 44, 55};
		
		pm.print(arr);
		
		pm.mul10(arr);
		pm.print(arr);
		
		int[] res = pm.mul10v2(arr);
		
//		pm.print(arr);
		pm.print(res);
		
	}
}
