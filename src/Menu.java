import java.util.ArrayList;

public class Menu {
    ArrayList<Character> arrayListSourceFile;
    ArrayList<Character> arrayListSourceEncryptFile;
    static ArrayList<Character> decryptionFile;
    static ArrayList<Character> decryptionFileForWrite;
    int yourShiftKey;
    int operationSelect;

    public void starting() {
        // Вибір операції - шифрування або розшифрування
        ChoiceOfOperation choiceOfOperation = new ChoiceOfOperation();
        choiceOfOperation.operationSelection();
    }

    public void encryptRun() {
        ReadFile readFile = new ReadFile();
        arrayListSourceFile = readFile.readFileToChar();

        KeySelection keySelection = new KeySelection();
        yourShiftKey = keySelection.selectKey();

        EncryptionProcess encryptionProcess = new EncryptionProcess(arrayListSourceFile, yourShiftKey);

        ArrayList<Character> arrayListEncryptFile;
        arrayListEncryptFile = encryptionProcess.encrypt1();

        WriteFile writeFile = new WriteFile(arrayListEncryptFile);
        writeFile.selectDirectoryFromWrite();

        EndMenu endMenu = new EndMenu();
        endMenu.operationSelection();

    }

    public void decryptRun() {
        ReadFile readFileDecrypt = new ReadFile();
        arrayListSourceEncryptFile = readFileDecrypt.readFileToChar();

        DecryptionProcess decryptionProcess = new DecryptionProcess();
        decryptionProcess.setArrayListEncryptFile(arrayListSourceEncryptFile);

        DecryptionMethod decryptionMethod = new DecryptionMethod();
        decryptionMethod.operationSelection();

        SeparateCodeKey separateCodeKey = new SeparateCodeKey();
        decryptionFileForWrite = separateCodeKey.separate(decryptionFile);

        WriteFileDecryption writeFileDecryption = new WriteFileDecryption(decryptionFileForWrite);
        writeFileDecryption.write();

        EndMenu endMenu = new EndMenu();
        endMenu.operationSelection();
    }
}