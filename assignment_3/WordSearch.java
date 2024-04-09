package Assign4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch {

	public static void main(String[] args) {
		String filePath = "student.txt";
        String searchWord = "word_to_search";
        int occurrences = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        occurrences++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Occurrences of \"" + searchWord + "\" in the file: " + occurrences);
    }

}


