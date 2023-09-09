package DictionaryApp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
public class DictClass {
    int size = 100; // available size the dictionary
    int length = 0; // Count of records in the dictionary
    RecordClass[] Record = new RecordClass[100];
    int[] keys = new int[100];

    private void sortArray () {
        Arrays.sort(keys);
    }
    void getKey ( int key) {
        sortArray();
        int keyFound = Arrays.binarySearch(keys , key);
        if (keyFound < 0) {
            System.out.println("No such key found");
        }else {
            for (int i=0 ; i<length ; i++) {
                if(Record[i].key == key){
                    System.out.println("Key found at index " + keyFound + " with value " + Record[i].value);
                    break;
                }
            }
        }
    }

    void putRecord (double value) {
        sortArray();
        int key = (int)value;
        int keyFound = Arrays.binarySearch(keys , key);
        if (keyFound < 0) {
            keys[length] = key;
            Record[length] = new RecordClass(value);
            length = length + 1;
            size = size -1;
            System.out.println("Key created successfully");
        }else{
            for (int i=0 ; i < length ; i++){
                if(Record[i].key == key){
                    Record[i].value = value;
                    break;
                }
            }
            System.out.println("Key updated successfully");
        }
    }

    void removeRecord (int key){
        sortArray();
        int keyFound = Arrays.binarySearch(keys , key);
        if (keyFound < 0) {
            System.out.println("No such Key exists");
        }else {
            keys[keyFound] =0;
            for (int i=0 ; i< length ; i++){
                if(Record[i].key == key){
                    Record[i].key = 0;
                    Record[i].value =0;
                    System.out.println("Record Removed Successfully");
                    break;
                }
            }
            //length = length +1;
            //size = size -1;
        }
        sortArray();
        //Arrays.sort(Record); // Trying to Tackle problem of empty spaces left in the objects
    }

    void records () {
        for(int i=0 ; i < length ; i++) {
            System.out.println("Record no " + (i+1) + " key:" + Record[i].key + " value:" + Record[i].value );
        }
    }
}
