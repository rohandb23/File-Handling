package com.aurionpro.model;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class FileHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file location : ");
		String fileLocation = sc.nextLine();
		
		int lineCount = countOfLines(fileLocation);
		System.out.println("number of lines in file : "+lineCount);
		
		int wordCount = countOfWords(fileLocation);
		System.out.println("number of words in file : "+wordCount);
		
		int characterCount = countOfChararters(fileLocation);
		System.out.println("number of characters in file : "+characterCount);
	}

	private static int countOfChararters(String fileLocation) {
		int count =0;
		try(FileReader reader = new FileReader(fileLocation)){
			int character;
			while((character = reader.read()) != -1) {
				count++;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	private static int countOfWords(String fileLocation) {
		int count=0;
		try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){
			String line;
			while((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				count++;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	private static int countOfLines(String fileLocation) {
		int count=0;
		try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){
			String line;
			while((line=reader.readLine()) != null) {
				count++;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
