package kh20200213;

public class Execute {
	public static void main(String[] args) {
				
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo(); //�̸��� ���� �Է�
		
		ss.insertScore(); //������ ���� �Է�
		
		ss.calcSum();

		ss.calcAvg();
		
		ss.printStu(); //�л� ���� ���
		
	}
}


