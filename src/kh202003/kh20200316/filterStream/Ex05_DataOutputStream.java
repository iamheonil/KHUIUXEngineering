package kh202003.kh20200316.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_DataOutputStream {
	public static void main(String[] args) {

		File file = new File("./src/kh202003/kh20200316/", "BufferedOut2.txt");

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

			dos.write(100); // ASCII CODE

			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeInt(123);
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // Main End
} // Class End