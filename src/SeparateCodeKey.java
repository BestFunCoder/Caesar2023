import java.util.ArrayList;

public class SeparateCodeKey {
    final int AMOUNT_CHARACTER_IN_CODE = 3;
    ArrayList<Character> separateKeyCode = new ArrayList<>();
    ArrayList<Character> decryptionFileFreeCodeKey = new ArrayList<>();

    public ArrayList<Character> getSeparateKeyCode() {
        return separateKeyCode;
    }

    public ArrayList<Character> separate(ArrayList<Character> decryptionFile) {

        for (int i = 0; i < decryptionFile.size(); i++) {
            if (i < AMOUNT_CHARACTER_IN_CODE) {
                separateKeyCode.add(decryptionFile.get(i));
            } else {
                decryptionFileFreeCodeKey.add(decryptionFile.get(i));
            }
        }
        new BruteForceKeyDetermination(separateKeyCode);
        return decryptionFileFreeCodeKey;
    }
}