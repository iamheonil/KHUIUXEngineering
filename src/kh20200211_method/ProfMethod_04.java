package kh20200211_method;



// 기능 클래스

public class ProfMethod_04 {

	//배열의 모든 요소 출력(print)
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	public void mul10(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 10;
		}
	}
	
	public int[] mul10v2(int[] arr) { 
		int[] res = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[i] * 10;
		}
		return res;
	} 	
}