import java.util.ArrayList;
import java.util.Arrays;

public class BruteForceKeyDetermination {
    private final ArrayList<Character> CONSTANT_CODE_KEY = new ArrayList<>(Arrays.asList('А', 'Б', 'В'));
    private final String KEY_FOUND = "- Ключ знайдено." +
            " -";
    private final String KEY_NOT_FOUND = "- Вірного ключа не знайдено. -";


    private ArrayList<Character> codeKey;
    private ArrayList<Character> decryptionFile;
    private ArrayList<Character> decryptionFileForWrite;

    public BruteForceKeyDetermination(ArrayList<Character> decryptionFile){
      this.decryptionFile = decryptionFile;
    }

    public void determinationKey(){
        SeparateCodeKey separateCodeKey = new SeparateCodeKey();
        decryptionFileForWrite = separateCodeKey.separate(decryptionFile);
        codeKey = separateCodeKey.getSeparateKeyCode();

        if(CONSTANT_CODE_KEY.equals(codeKey)){
            System.out.println(KEY_FOUND);
            WriteFileDecryption writeFileDecryption = new WriteFileDecryption(decryptionFileForWrite);
            writeFileDecryption.write();
            new EndMenu().operationSelection();
        } else {
            System.out.println(KEY_NOT_FOUND);
        }
    }
}