package Phase1.Jav.Projects;

import java.io.*;

public class file_handling {

	public static void main(String[] args) throws IOException {

		try {
			File file = new File("file.txt");

			if (file.createNewFile()) {

				System.out.println("File is created");
			} else {
				if (file.exists()) {
					System.out.println("File already exists.");
					System.out.println("File path:" + file.getAbsolutePath());
					System.out.println("File name:  " + file.getName());
					System.out.println("File class:  " + file.getClass());
					System.out.println("File parent:  " + file.getParent());
					System.out.println("File space allocated:  " + file.getUsableSpace());
					System.out.println("File length: " + file.length());
					System.out.println("File list:   " + file.list());

				} else {
					System.out.println("File does not exists.");
				}
				
				// FileWriter
				
				FileWriter fr = new FileWriter(file);
				fr.write("This is written through writer class");
				fr.close();
			}
		

				// --------------Delete the file code below-------------//
				boolean b = file.delete();
				if (b == true) {
					System.out.println("File deleted !!");
				} else {
					System.out.println("File not deleted");
				}
				// ------------end of the above code--------------------//
			}
	 catch (IOException e) {
			e.printStackTrace();
		}

	}
}

