package kh20200313.quiz;

import java.io.File;

public class QuizEx_01 {
	public static void main(String[] args) {

		File file = new File("./src/kh20200313/quiz/Snippet.java", "Source.txt");

		System.out.println(file.exists());

	}
}