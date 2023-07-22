import java.util.ArrayList;
import java.util.List;

public class DecryptionProcess {
    SampleUkrainianAlphabet sampleUkrainianAlphabet = new SampleUkrainianAlphabet();
    ArrayList<Character> alphabetUAWithPunctuation = sampleUkrainianAlphabet.getAlphabetUAWithPunctuation();
    ArrayList<Character> punctuation = sampleUkrainianAlphabet.getPunctuation();
    ArrayList<Character> arrayListOutputFile = new ArrayList<>();

    static List<Character> arrayListSourceEncryptFile = new ArrayList<>();
    int key;

    public void setArrayListEncryptFile(List<Character> arrayListSourceEncryptFile) {
        this.arrayListSourceEncryptFile = arrayListSourceEncryptFile;
    }

    public ArrayList<Character> decryptionRun (int key){
        this.key = key;
        for (Character ch : arrayListSourceEncryptFile) {
            //отримуємо чар з масиву-джерела

            if (punctuation.contains(ch)) {
                //encryptionCore(ch);
                arrayListOutputFile.add(decryptionCore(ch));
            }

            //перевірка чи чар є UpperCase
            else if (Character.isUpperCase(ch)) {
                arrayListOutputFile.add(decryptionCore(ch));


                // якщо чар LowerCase
            } else if (Character.isLowerCase(ch)) {
                // Переводимо чар в юперКейс і перевіряємо чи є в українській мові
                char chUpperCase = Character.toUpperCase(ch);
                char tempCh = decryptionCore(chUpperCase);
                arrayListOutputFile.add(Character.toLowerCase(tempCh));

            }
        }
        return arrayListOutputFile;
    }

    public char decryptionCore(char ch) {
        char tempChar = '$';
        int tempKey = 0;
        if (alphabetUAWithPunctuation.contains(ch)) {
            int i = alphabetUAWithPunctuation.indexOf(ch);
            tempKey = i - key;
            //зациклення для алфавіту
            if (tempKey < 0) {
                tempKey = alphabetUAWithPunctuation.size() - Math.abs(tempKey);
            }
            tempChar = alphabetUAWithPunctuation.get(tempKey);

        }
        return tempChar;
    }
}