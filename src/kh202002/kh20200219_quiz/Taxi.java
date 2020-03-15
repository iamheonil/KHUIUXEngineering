package kh202002.kh20200219_quiz;

public class Taxi implements Fare {

	@Override
	public void calc(int distance) {
		
		int pay = distance * Fare.FEE * 2;
		System.out.println(distance + "m 운행했을 때 요금은 : " + pay + "원 입니다.");
	}
}