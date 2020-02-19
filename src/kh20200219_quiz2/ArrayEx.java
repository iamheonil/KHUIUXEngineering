package kh20200219_quiz2;

// import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		Array ar = new Array();
		
		ar.add("Apple");
		ar.add("Banana");
		ar.add("Cherry");

//		ar.add("Apple");
//		ar.add("Banana");
//		ar.add("Cherry");

		ar.print(); // Apple, Banana, Cherry
		System.out.println("----------");
		
		System.out.println("Remove");
		ar.remove("Banana");
		ar.print(); // Apple, Cherry
		System.out.println("----------");

//		System.out.println("idx cheery, null");
		System.out.println( ar.get(1) ); // Cherry
		System.out.println( ar.get(2) ); // null
		System.out.println("----------");
		
		System.out.println( ar.find("Apple") ); // 0
		System.out.println( ar.find("Banana") ); // -1
		System.out.println( ar.find("Cherry") ); // 1
		
		System.out.println("----------");
//		ar.print();

	}
}
