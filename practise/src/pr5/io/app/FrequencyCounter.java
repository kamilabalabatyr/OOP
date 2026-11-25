package pr5.io.app;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "report.txt";

        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedEntries = wordCounts.entrySet()
            .stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .collect(Collectors.toList());

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("Word frequency кeport: ");
            for (Map.Entry<String, Integer> entry : sortedEntries) {
                writer.printf("%-20s %d%n", entry.getKey(), entry.getValue());
            }
            System.out.println("Results written to " + new File(outputFile).getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error writing output file: " + e.getMessage());
        }
    }
}