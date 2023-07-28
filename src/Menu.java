import java.util.ArrayList;

public class Menu {
    ArrayList<Character> SourceFile;
    ArrayList<Character> SourceEncryptFile;
    static ArrayList<Character> decryptionFile;
    static ArrayList<Character> decryptionFileForWrite;
    int yourShiftKey;

    public void starting() {
        ChoiceOperationEncryptOrDecrypt choiceOfOperation = new ChoiceOperationEncryptOrDecrypt();
        choiceOfOperation.operationSelection();
    }

    public void encryptRun() {
        ReadFile readFile = new ReadFile();
        SourceFile = readFile.readFileToChar();

        KeySelection keySelection = new KeySelection();
        yourShiftKey = keySelection.selectKey();

        EncryptionProcess encryptionProcess = new EncryptionProcess(SourceFile, yourShiftKey);

        ArrayList<Character> arrayListEncryptFile;
        arrayListEncryptFile = encryptionProcess.encrypt1();

        WriteFile writeFile = new WriteFile(arrayListEncryptFile);
        writeFile.selectDirectoryFromWrite();

        EndMenu endMenu = new EndMenu();
        endMenu.operationSelection();
    }

    public void decryptRun() {
        ReadFile readFileDecrypt = new ReadFile();
        SourceEncryptFile = readFileDecrypt.readFileToChar();

        DecryptionProcess decryptionProcess = new DecryptionProcess();
        decryptionProcess.setArrayListEncryptFile(SourceEncryptFile);

        DecryptionMode decryptionMode = new DecryptionMode();
        decryptionMode.operationSelection();

        SeparateCodeKey separateCodeKey = new SeparateCodeKey();
        decryptionFileForWrite = separateCodeKey.separate(decryptionFile);

        WriteFileDecryption writeFileDecryption = new WriteFileDecryption(decryptionFileForWrite);
        writeFileDecryption.write();

        EndMenu endMenu = new EndMenu();
        endMenu.operationSelection();
    }
}