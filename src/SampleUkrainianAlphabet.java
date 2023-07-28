import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleUkrainianAlphabet {
    private static final Character[] ALPHABET_UKRAINIAN = {'А', 'Б', 'В', 'Г', 'Ґ', 'Д', 'Е', 'Є', 'Ж', 'З', 'И', 'І', 'Ї', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ю', 'Я'};
    public  List<Character> alphabetUkrainian = new ArrayList<>(Arrays.asList(ALPHABET_UKRAINIAN));

    private static final Character[] PUNCTUATION = {'.', ',', '"', ':', '!', '?', ' ', ';'};
    public ArrayList<Character> punctuation = new ArrayList<>(Arrays.asList(PUNCTUATION));
    public ArrayList<Character> getPunctuation(){
        return punctuation;
    }

    private final ArrayList<Character> alphabetUAWithPunctuation = new ArrayList<>();
    public ArrayList<Character> getAlphabetUAWithPunctuation() {
        alphabetUAWithPunctuation.addAll(alphabetUkrainian);
        alphabetUAWithPunctuation.addAll(punctuation);
        return alphabetUAWithPunctuation;
    }
}