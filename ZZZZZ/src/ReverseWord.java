public class ReverseWord {
    public static void main(String[] args) {
        String sentence = "Yashraj ranjeet shitole is a very good boy";
        String[] words = sentence.split("\\s+"); // Split sentence into words
        
        StringBuilder modifiedSentence = new StringBuilder();
        for (String word : words) {
            if (word.contains("a") || word.contains("A")) {
                StringBuilder reversed = new StringBuilder(word);
                int indexOfA = word.toLowerCase().indexOf('a');
                reversed.reverse();
                if (Character.isUpperCase(word.charAt(indexOfA))) {
                    reversed.setCharAt(0, Character.toUpperCase(reversed.charAt(0)));
                }
                modifiedSentence.append(reversed).append(" ");
            } else {
                modifiedSentence.append(word).append(" ");
            }
        }
        
        System.out.println("Modified Sentence: " + modifiedSentence.toString().trim());
    }
}
