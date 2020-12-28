package Q706;

public class MyHashMap {
    Data[] array;
    int capacity = 10001;

    class Data{
        int key;
        int value;
    }

    public MyHashMap() {
         array = new Data[capacity];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hash = hashFunc(key);
        while(array[hash] != null && array[hash].key != key) {
            hash = (hash +1) % capacity;
        }
        array[hash] = new Data();
        array[hash].key = key;
        array[hash].value = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hash = hashFunc(key);
        while(array[hash] != null && array[hash].key != key) {
            hash = (hash +1) % capacity;
        }
        if (array[hash] == null) {
            return -1;
        } else {
            return array[hash].value;
        }
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hash = hashFunc(key);
        while(array[hash] != null && array[hash].key != key) {
            hash = (hash +1) % capacity;
        }
        if (array[hash] != null) {
            array[hash] = null;
        }
    }

    private int hashFunc(int key) {
        return key % 1001;
    }
}
