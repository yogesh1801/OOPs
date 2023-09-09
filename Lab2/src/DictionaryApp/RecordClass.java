package DictionaryApp;

public class RecordClass {
    int key;
    double value;

    public RecordClass(double value) {
        this.value = value;
        this.key = (int)value;
    }
}
