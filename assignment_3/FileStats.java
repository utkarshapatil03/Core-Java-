package Assign4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
	 public static void main(String[] args) {
	        String filePath = "Filehandling.txt";
	        int charCount = 0;
	        int wordCount = 0;
	        int lineCount = 0;

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                lineCount++;
	                charCount += line.length();
	                String[] words = line.trim().split("\\s+");
	                wordCount += words.length;
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }

	        System.out.println("Number of characters: " + charCount);
	        System.out.println("Number of words: " + wordCount);
	        System.out.println("Number of lines: " + lineCount);
	    }
}
