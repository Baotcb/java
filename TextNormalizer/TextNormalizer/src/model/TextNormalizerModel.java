package model;

public class TextNormalizerModel {
    public String normalizeText(String input) {
        // Rule 1: Only one space between words.
        String normalizedText = input.replaceAll("\\s+", " ");

        // Rule 2: Only one space after comma (,), dot (.) and colon (:).
        normalizedText = normalizedText.replaceAll("\\s*,\\s*", ", ");
        normalizedText = normalizedText.replaceAll("\\s*\\.\\s*", ". ");
        normalizedText = normalizedText.replaceAll("\\s*:\\s*", ": ");

        // Rule 3: First character of the word after a dot is in Uppercase, and other words are in lowercase.
        String[] sentences = normalizedText.split("\\.");
        StringBuilder result = new StringBuilder();
        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (!sentence.isEmpty()) {
                String[] words = sentence.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    if (i == 0) {
                        words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                    } else {
                        words[i] = words[i].toLowerCase();
                    }
                }
                result.append(String.join(" ", words)).append(". ");
            }
        }

        // Rule 4: No spaces before and after sentence or word phrases in quotes (“”).
        normalizedText = result.toString().replaceAll("\\s*\"\\s*", "\"").replaceAll("\\s*\"\\s*", "\"");

        // Rule 5: First character of the word in the first line is in Uppercase.
        String[] lines = normalizedText.split("\\n");
        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
            if (!lines[i].isEmpty()) {
                if (i == 0) {
                    lines[i] = lines[i].substring(0, 1).toUpperCase() + lines[i].substring(1);
                }
                finalResult.append(lines[i]).append("\n");
            }
        }

        // Rule 6: No blank line between lines.
        finalResult = new StringBuilder(finalResult.toString().replaceAll("\\n\\s*\\n", "\n"));

        // Rule 7: No space between comma or dot and the word in front of it.
        finalResult = new StringBuilder(finalResult.toString().replaceAll("\\s*\\,", ",").replaceAll("\\s*\\.", "."));

        // Rule 8: Must have a dot at the end of the text.
        finalResult = new StringBuilder(finalResult.toString().trim() + ".");

        return finalResult.toString();
    }
}
