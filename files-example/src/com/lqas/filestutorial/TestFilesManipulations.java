package com.lqas.filestutorial;

import java.io.IOException;
import java.util.ArrayList;

public class TestFilesManipulations {
	
	public static void main(String[] args) throws IOException{
		
		String username = PropertyLoader.loadProperty("user.username");
		System.out.println(username);
		
		ArrayList<String> readFile = FileReaderWriter.readFileToArrayList("testfile.txt");
		System.out.println(readFile.get(2));
		
		FileReaderWriter.printParsedFile(readFile);
//////		
		ArrayList<String> writeArrayToList = new ArrayList<String>();
	
		writeArrayToList.add("1");
		writeArrayToList.add("22");
		writeArrayToList.add("333");
		writeArrayToList.add("44444");
		writeArrayToList.add("555555");
		
		FileReaderWriter.writeArrayToFile("testfileToWrite.txt", writeArrayToList);
		
	}
}
