package kh202003.kh20200312_quiz;

public class CharacterProcess {

	public int countAlpha(String s) throws CharCheckException {

		if (s.contains(" ")) {
			throw new CharCheckException();
		} else {
			System.out.print("\n�Է��Ͻ� " + s + "�� ���ڼ��� : " + s.length());
			int result = s.length();
			return result;
		}

	}

}
