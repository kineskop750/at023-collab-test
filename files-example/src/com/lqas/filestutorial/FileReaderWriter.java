package com.lqas.filestutorial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReaderWriter {

	public static ArrayList<String> readFileToArrayList(String fileToRead) throws FileNotFoundException {
		File file = new File(fileToRead);
		
		ArrayList<String> names = new ArrayList<String>();
		Scanner in = null;
		try {
			in = new Scanner(file);
			while (in.hasNextLine()) {
				names.add(in.nextLine());
			}
		} finally {
			in.close();
		}

		return names;
	}

	public static void writeArrayToFile(String fileToWrite, ArrayList<String> arrayListToWrite) throws IOException {
		
		FileWriter fw = new FileWriter(fileToWrite, true);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(fw);
			int k = 0;
			for (String s : arrayListToWrite) {
				if (k == (arrayListToWrite.size() - 1)) {
					bw.write(s);
				} else {
					bw.write(s + "\n");
				}
				// write text to the file using write method
				k++;
			}
		} finally {
			//bw.flush();//write any buffered text to the file
			bw.close();// close file using close() method
			fw.close();
		}
	}

	public static void printParsedFile(ArrayList<String> arrayListFromFile) {
		for (String s : arrayListFromFile) {
			System.out.println(s);
		}
	}

}
