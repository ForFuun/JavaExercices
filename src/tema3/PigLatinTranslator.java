package tema3;

public class PigLatinTranslator {
    public String translate(String input) {
        String[] words = input.split(" ");
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : words) {
            String translatedWord = translateWord(word);
            translatedSentence.append(translatedWord).append(" ");
        }

        return translatedSentence.toString().trim();
    }

    private String translateWord(String word) {
        if (startsWithVowelSound(word)) {
            return word + "ay";
        } else if (startsWithConsonantSound(word)) {
            int indexOfFirstVowel = indexOfFirstVowelSound(word);
            String prefix = word.substring(0, indexOfFirstVowel);
            String suffix = word.substring(indexOfFirstVowel);
            return suffix + prefix + "ay";
        } else {
            return word + "ay";
        }
    }

    private boolean startsWithVowelSound(String word) {
        return word.matches("(?i)^[aeiouyxr].*");
    }

    private boolean startsWithConsonantSound(String word) {
        return word.matches("(?i)^[^aeiouyxr].*");
    }

    private int indexOfFirstVowelSound(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (startsWithVowelSound(word.substring(i))) {
                return i;
            }
        }
        return -1;
    }
}
