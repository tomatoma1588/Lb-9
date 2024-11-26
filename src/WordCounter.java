public class WordCounter {

    public static int countWords(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("Речення не може бути null.");
        }
        String[] words = sentence.split("\\b[a-zA-Z]+\\b");
        return words.length - 1; // Враховуються тільки слова
    }

    public static void main(String[] args) {
        try {
            String sentence = "The user with the nickname koala757677 this month left 3 times more comments than the user with the nickname croco181dile181920 4 months ago";
            System.out.println(countWords(sentence)); // 19

            // Інші приклади
            System.out.println(countWords("Hello world!")); // 2
            System.out.println(countWords("12345")); // 0

            // Демонстрація помилки
            System.out.println(countWords(null));
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
