import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

		public class WordCount {
		    public static void main(String[] args) {
		        String fileName = "okay.txt"; 
		        Map<String, Integer> wordCountMap = new TreeMap<>();

		        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		                String[] words = line.split("\\s+"); 
		                for (String word : words) {
		                    
		                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
		                    if (!word.isEmpty()) {
		                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		                    }
		                }
		            }
		        } catch (IOException e) {
		            System.err.println("Error reading the file: " + e.getMessage());
		        }

		        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
	
	}


