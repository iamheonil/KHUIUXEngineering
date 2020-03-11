package kh20200311;

import java.util.Arrays;
import java.util.List;

public class Generic_WildCard {
		
	public static void display(List<?> list) {
//	public static void display(List<? extends Number> list) {	// <?> ������ ��� �� ������ Number �� ���� �ִ� �ڷ����鸸 �޴´�
//	public static void display(List<? super String> list) 	{
	
		for(Object o : list) {
			System.out.println( o );
			
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> iList = Arrays.asList(10, 20, 30);
		
		display(iList);
		
		List<String> sList = Arrays.asList("A", "B", "C");
		display(sList);
		
		Object o = null;
		Integer i = null;
		
		o = i;	// Object �� Integer �� �θ��̴�.
		
		List<Object> ol = null;
		List<Integer> il = null;
		
		// ol = il; : ���� 
		// ���׸��� �ڹ��� �⺻ ��ӱ����� �����Ѵ�.
		// �⺻��Ģ�� �̷������� ���ϵ� ī�带 ���������ν� ������ ���ܳ�����
		
	}
}