import java.util.ArrayList;
import java.util.Arrays;

public class BruteForceKeyDetermination {
    private final ArrayList<Character> CONSTANT_CODE_KEY = new ArrayList<>(Arrays.asList('А', 'Б', 'В'));
    private final String KEY_FOUND = "- Ключ знайдено -";
    private final String KEY_NOT_FOUND = "- Вірного ключа не знайдено. -";


    ArrayList<Character> codeKey;

    //Keys key1 = new Key1();
    //Keys key2 = new Key2();
    //Keys key3 = new Key3();

    private SeparateCodeKey separateCodeKey = new SeparateCodeKey();
    ArrayList<Character> decryptionFileFreeCodeKey = separateCodeKey.getDecryptionFileFreeCodeKey();
    ArrayList<Character> separateKeyCode;
    private ArrayList<Character> decryptionFileForWrite;
    public BruteForceKeyDetermination(){}
    public BruteForceKeyDetermination(ArrayList<Character> separateKeyCode){
        this.separateKeyCode = separateKeyCode;
    }

    public void determinationKey(ArrayList<Character> decryptionFileForWrite){
        separateCodeKey.getSeparateKeyCode();
        separateCodeKey.getDecryptionFileFreeCodeKey();

        if(CONSTANT_CODE_KEY.equals(separateKeyCode)){
            System.out.println(KEY_FOUND);
            WriteFileDecryption writeFileDecryption = new WriteFileDecryption(decryptionFileForWrite);
            writeFileDecryption.write();
        } else {
            System.out.println(KEY_NOT_FOUND);
        }

    }
}