package com.damladincer.oop.userinteraction;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
	
	public static void main(String[] args) {
		int wordCount = 0;
		File file = new File("pg48023.txt");
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(file);
			while (fileScanner.hasNextLine()) {
				String line=fileScanner.nextLine().trim();
				String[] words = line.split(" ");
				wordCount += words.length;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("The book includes " + wordCount + " words");
	}
}