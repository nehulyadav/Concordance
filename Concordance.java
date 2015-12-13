


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {

	private String fileName = null;
	private Map<String, Integer> table = null;

	public Concordance(String fileName) {
		this.fileName = fileName;
		this.table = generateConcordanceFromFile(fileName);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(String.format("Concordance for: %s\n", this.fileName)); // converting Map to String to print it out.
		for(Map.Entry<String,Integer> entry : table.entrySet()) {
			stringBuilder.append(String.format("%s : %d\n", entry.getKey(), entry.getValue()));


		}
		return stringBuilder.toString();
	}

	private static Map<String, Integer> generateConcordanceFromFile(String fileName) {
		Map<String,Integer> concordance = new HashMap<>(); //Map is table, creating empty table

		List<String> lines = readLinesFromFile(fileName);
		for(String line : lines) {
			String[] words = line.split("\\w+");
			for(String word : words) {
				if(concordance.containsKey(word)) {
					concordance.put(word, concordance.get(word) + 1); // repetaed word so increment count by 1.
				} else {
					concordance.put(word,  1);  } // new word, so place value 1.
			}
			}
		return concordance;
		}
	

	private static List<String> readLinesFromFile(String fileName) {
		try(Stream<String> lines = Files.lines(new File(fileName).toPath())) {
			return lines.collect(Collectors.toList());
		} catch (IOException exception) {
			System.err.printf("unable to read the file: %s\n", fileName);
			return new ArrayList<>();

		}
	}}




