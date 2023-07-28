import java.util.ArrayList;
import java.util.List;

public class DecryptionProcess {
    SampleUkrainianAlphabet sampleUkrainianAlphabet = new SampleUkrainianAlphabet();
    ArrayList<Character> alphabetUAWithPunctuation = sampleUkrainianAlphabet.getAlphabetUAWithPunctuation();
    ArrayList<Character> punctuation = sampleUkrainianAlphabet.getPunctuation();
    ArrayList<Character> OutputFile = new ArrayList<>();

    static List<Character> SourceEncryptFile = new ArrayList<>();
    int key;

    public void setArrayListEncryptFile(List<Character> SourceEncryptFile) {
        DecryptionProcess.SourceEncryptFile = SourceEncryptFile;
    }

    public ArrayList<Character> decryptionRun(int key) {
        this.key = key;
        for (Character ch : SourceEncryptFile) {
            if (punctuation.contains(ch)) {
                OutputFile.add(decryptionCore(ch));
            } else if (Character.isUpperCase(ch)) {
                OutputFile.add(decryptionCore(ch));
            } else if (Character.isLowerCase(ch)) {
                char chUpperCase = Character.toUpperCase(ch);
                char tempCh = decryptionCore(chUpperCase);
                OutputFile.add(Character.toLowerCase(tempCh));
            }
        }
        return OutputFile;
    }

    public char decryptionCore(char ch) {
        char tempChar = ' ';
        int tempKey;
        if (alphabetUAWithPunctuation.contains(ch)) {
            int i = alphabetUAWithPunctuation.indexOf(ch);
            tempKey = i - key;
            if (tempKey < 0) {
                tempKey = alphabetUAWithPunctuation.size() - Math.abs(tempKey);
            }
            tempChar = alphabetUAWithPunctuation.get(tempKey);
        }
        return tempChar;
    }
}