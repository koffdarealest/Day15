import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        for (String word : words) {
            for (String row : rows) {
                if (word.toLowerCase().matches("[" + row + "]+")) {
                    result.add(word);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = q1.findWords(words);
        for (String word : result) {
            System.out.println(word);
        }
    }
}
