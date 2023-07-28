public class Key1 extends Keys{

    public final int INT_KEY = 3;
    public final Character CODE_KEY_1 = 'Г';
    public final Character CODE_KEY_2 = 'Ґ';
    public final Character CODE_KEY_3 = 'Д';

    @Override
    public void setIntKey(int INT_KEY) {
        super.setIntKey(INT_KEY);
    }

    @Override
    public void setCodeKey1(Character CODE_KEY_1) {
        super.setCodeKey1(CODE_KEY_1);
    }

    @Override
    public void setCodeKey2(Character CODE_KEY_2) {
        super.setCodeKey2(CODE_KEY_2);
    }

    @Override
    public void setCodeKey3(Character CODE_KEY_3) {
        super.setCodeKey3(CODE_KEY_3);
    }

    @Override
    public void buildKey() {
        setIntKey(INT_KEY);
        setCodeKey1(CODE_KEY_1);
        setCodeKey2(CODE_KEY_2);
        setCodeKey3(CODE_KEY_3);
    }

    public int getINT_KEY() {
        return INT_KEY;
    }
}