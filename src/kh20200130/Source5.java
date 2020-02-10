package kh20200130;

public class Source5 {
	public static void main(String[] args) {
// 꿀팁들
//		System.out.println("Ctrl + Alt + 아래 혹은 위로 방향키 -> 위, 혹은 아래로 밀어내며 복사");
//		System.out.println("Ctrl + D(Delete) -> 커서가 위치한 해당줄 삭제");
//		System.out.println("Alt + 방향키 -> 해당줄을 위 아래로 왔다갔다");
//		System.out.println("Ctrl + 방향키 -> 스크롤 / 근데 이거는 많이 안 쓸 거 같은데..");
/////////////
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		int num7;
		
		num1 = 30;
		num2 = 50;
		num3 = 70;
		num4 = 90;
		num5 = 110;
		num6 = 130;
		num7 = 150;
		
//		num1 = num2;
//		<---------- 로 대입이 된다.
		
//		System.out.println(num1);
		
		num6 = num5 = num4 = num3;
		num3 = num4 = num5 = num6;
		
//		System.out.println(num6);
//		System.out.println(num3);
		
		// 산술대입 연산
		System.out.println("산술대입 연산 전");
		System.out.println("Num1 : " + num1);
		System.out.println("Num2 : " + num2);
		
		num2 += num1; // 산술 대입
		
		System.out.println("산술대입 연산 후");
		System.out.println("Num1 : " + num1);
		System.out.println("Num2 : " + num2);
		
//		num2 -= num1;	// 산술복합대입연산자(이항)
//		num2 = -num1;	// 대입연산자(이항), '-' 부호변환연산자(단항)
//		System.out.println(num2);
//		잘 기억하기
		
	}
}

// 이항연산자 - 대입
// = 오른쪽에 있는 값을 왼쪽에 있는 변수명에 대입해주는것
// int main -> main = 10 
// main 변수 선언 후 main 변수에 10이라는 값을 대입한다.

// 연산자 우선순위(교재 24P) 혹은 https://t1.daumcdn.net/cfile/tistory/2219753856A8E8D92E
// 외울 필요는 없고 필요시 꺼내서 보면 된다. 연산자의 종류, 연산순위, 연산방향 등

// 복합대입연산자 - 산술대입
// +=, -=, *=, /=, %=
