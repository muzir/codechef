package org.muzir.interview.marketlogic;


import java.util.*;
import java.util.stream.Collectors;


public class SuggestionBuilder {


    /**
     * The maximum amount of words which can be combined to a suggestion
     */

    private final static int MAX_COMBINED_TOKENS = 3;


    private static final class Suggestion {

        private final String text;


        public Suggestion(String text) {

            this.text = text;

        }

        public String toString() {

            return text;

        }
    }

    /**
     * Derives a list of suggestions from the given token stream. The given list
     * <p>
     * of tokens reflect a sorted list of tokens of a text. Each token reflects
     * <p>
     * either a single word or a punctuation mark like :.? A suggestion is
     * <p>
     * either a single word or a combination of following words (delimited by a
     * <p>
     * single space) and does not include any stopWord or a single character.
     * <p>
     * Combined word suggestions can maximal include MAX_COMBINED_TOKENS of
     * <p>
     * following words.
     * <p>
     * <p>
     * <p>
     * Example: Stop Words = {"is", "a", "can", "the"}
     * <p>
     * <p>
     * <p>
     * Token Stream = {"The", "beautiful", "girl", "from", "the", "farmers", "market", ".", "I", "like", "chewing", "gum", "." }
     * <p>
     * <p>
     * <p>
     * Suggestions:
     * <p>
     * "beautiful",
     * <p>
     * "beautiful girl",
     * <p>
     * "beautiful girl from",
     * <p>
     * "girl",
     * <p>
     * "girl from",
     * <p>
     * "from",
     * <p>
     * "farmers",
     * <p>
     * "farmers market",
     * <p>
     * "market",
     * <p>
     * "like",
     * <p>
     * "like chewing",
     * <p>
     * "like chewing gum",
     * <p>
     * "chewing",
     * <p>
     * "chewing gum",
     * <p>
     * "gum"
     */


    private static List<Suggestion> buildSuggestionsFromTokenStream(Iterator<String> tokens, Set<String> stopWords) {
        List<Suggestion> suggestions = new ArrayList<>();
        if (!tokens.hasNext()) return suggestions;
        StringBuilder combinedTokens = new StringBuilder();
        String word = tokens.next();
        int combinedTokensCount = 0;
        while (isValidWord(word, stopWords, combinedTokensCount)) {
            combinedTokens.append(word);
            combinedTokens.append(" ");
            Suggestion suggestion = new Suggestion(combinedTokens.toString());
            suggestions.add(suggestion);
            word = tokens.next();
            combinedTokensCount++;
        }
        return suggestions;
    }

    private static boolean isValidWord(String word, Set<String> stopWords, int combinedTokensCount) {
        if (isSingleWord(word)) return false;
        if (isExceedCombinedTokens(word, combinedTokensCount)) return false;
        if (isStopWord(word, stopWords)) return false;
        return true;
    }

    private static boolean isStopWord(String word, Set<String> stopWords) {
        if (stopWords.stream().map(stopWord -> stopWord.toUpperCase()).collect(Collectors.toSet()).contains(word.toUpperCase())) {
            return true;
        }
        return false;
    }

    private static boolean isExceedCombinedTokens(String word, int combinedTokensCount) {
        if (combinedTokensCount > MAX_COMBINED_TOKENS) {
            return true;
        }
        return false;
    }

    private static boolean isSingleWord(String word) {
        if (word == null || word.length() == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> tokens = Arrays.asList("The", "beautiful", "girl", "from", "the", "farmers", "market", ".", "I", "like", "chewing", "gum", ".");
        List<Suggestion> suggestions = new ArrayList<>();
        Set<String> stopWords = new HashSet<>();
        stopWords.add("is");
        stopWords.add("a");
        stopWords.add("can");
        stopWords.add("the");
        for (int i = 0; i < tokens.size(); i++) {
            ListIterator<String> tokenIterator = tokens.listIterator(i);
            suggestions.addAll(SuggestionBuilder.buildSuggestionsFromTokenStream(tokenIterator, stopWords));
        }
        suggestions.stream().forEach(s -> System.out.println(s));
    }

}
