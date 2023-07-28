import java.util.ArrayList;

public class EncryptionProcess {

    ArrayList<Character> SourceFile;
    int yourShiftKey;
    int newShiftKey;
    SampleUkrainianAlphabet sampleUkrainianAlphabet = new SampleUkrainianAlphabet();
    ArrayList<Character> alphabetUAWithPunctuation = sampleUkrainianAlphabet.getAlphabetUAWithPunctuation();
    ArrayList<Character> punctuation = sampleUkrainianAlphabet.getPunctuation();
    KeySelection keySelection = new KeySelection();
    ArrayList<Character> OutputFile = new ArrayList<>();
    ArrayList<Character> EncryptFile = new ArrayList<>();

    public EncryptionProcess(ArrayList<Character> SourceFile, int yourShiftKey) {
        this.SourceFile = SourceFile;
        this.yourShiftKey = yourShiftKey;
    }

    public ArrayList<Character> encrypt1() {
        if (yourShiftKey == keySelection.yourShiftKey1) {
            withKey1();
        } else if (yourShiftKey == keySelection.yourShiftKey2) {
            withKey2();
        } else if (yourShiftKey == keySelection.yourShiftKey3) {
            withKey3();
        }
        encryption();
        return EncryptFile;
    }

    private void withKey1() {
        Key1 key1 = new Key1();
        OutputFile.add(key1.CODE_KEY_1);
        OutputFile.add(key1.CODE_KEY_2);
        OutputFile.add(key1.CODE_KEY_3);
    }

    private void withKey2() {
        Key2 key2 = new Key2();
        OutputFile.add(key2.CODE_KEY_1);
        OutputFile.add(key2.CODE_KEY_2);
        OutputFile.add(key2.CODE_KEY_3);
    }

    private void withKey3() {
        Key3 key3 = new Key3();
        OutputFile.add(key3.CODE_KEY_1);
        OutputFile.add(key3.CODE_KEY_2);
        OutputFile.add(key3.CODE_KEY_3);
    }

    public void encryption() {
        for (Character ch : SourceFile) {
            if (punctuation.contains(ch)) {
                OutputFile.add(encryptionCore(ch));
            } else if (Character.isUpperCase(ch)) {
                OutputFile.add(encryptionCore(ch));
            } else if (Character.isLowerCase(ch)) {
                char chUpperCase = Character.toUpperCase(ch);
                char tempCh = encryptionCore(chUpperCase);
                OutputFile.add(Character.toLowerCase(tempCh));
            }
        }
        EncryptFile = OutputFile;
    }

    public char encryptionCore(char ch) {
        char temp = ' ';
        if (alphabetUAWithPunctuation.contains(ch)) {
            int i = alphabetUAWithPunctuation.indexOf(ch);
            newShiftKey = i + yourShiftKey;
            if (newShiftKey > 40) {
                newShiftKey = newShiftKey % 41;
            }
            temp = alphabetUAWithPunctuation.get(newShiftKey);
        }
        return temp;
    }
}