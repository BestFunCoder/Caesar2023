import  java.util.ArrayList;

public abstract class Keys {
    int intKey;
    Character codeKey1;
    Character codeKey2;
    Character codeKey3;
    ArrayList<Character> codeKey = new ArrayList<>();

    public Keys(){}

    public Keys(int intKey, Character codeKey1, Character codeKey2, Character codeKey3){
        this.intKey = intKey;
        this.codeKey1 = codeKey1;
        this.codeKey2 = codeKey2;
        this.codeKey3 = codeKey3;
    }

    public void setIntKey(int intKey){
        this.intKey= intKey;
    }

    public void setCodeKey1(Character codeKey1){
        this.codeKey1 = codeKey1;
    }

    public  void setCodeKey2(Character codeKey2){
        this.codeKey2 = codeKey2;
    }

    public void setCodeKey3(Character codeKey3){
        this.codeKey3 = codeKey3;
    }

    public int getIntKey(){
        return intKey;
    };
    public ArrayList<Character> getCodeKey() {
        codeKey.add(codeKey1);
        codeKey.add(codeKey2);
        codeKey.add(codeKey3);
        return codeKey;
    }

    public abstract void buildKey();
}