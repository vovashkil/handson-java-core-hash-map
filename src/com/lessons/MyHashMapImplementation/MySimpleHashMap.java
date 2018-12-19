package com.lessons.MyHashMapImplementation;

public class MySimpleHashMap<K, V> implements SimpleHashMap<K, V> {

    private Entry<K, V>[] entries;
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;

    public MySimpleHashMap() {

        this(INITIAL_CAPACITY);

    }

    public MySimpleHashMap(int capacity) {

        entries = new Entry[capacity];

    }

    @Override
    public void put(K key, V value) {

        Entry<K, V> entry = Entry.entry(key, value);

        int currentIndex = getHash(key) % getEntriesSize();

        Entry<K, V> currentEntry = entries[currentIndex];

        if (currentEntry == null) {
            entries[currentIndex] = entry;
            size++;
        } else {
            // compare the keys see if key already exists
            while (currentEntry.getNext() != null) {
                if (currentEntry.getKey().equals(key)) {
                    currentEntry.setValue(value);
                    return;
                }
                currentEntry = currentEntry.getNext();
            }

            if (currentEntry.getKey().equals(key)) {
                currentEntry.setValue(value);
            } else {
                currentEntry.setNext(entry);
                size++;
            }
        }


    }

    public V get(K key) {

        int currentIndex = getHash(key) % getEntriesSize();

        Entry<K, V> currentEntry = entries[currentIndex];

        while (currentEntry != null) {

            if (currentEntry.getKey().equals(key)) {
                return currentEntry.getValue();
            }
            currentEntry = currentEntry.getNext();
        }

        return null;
    }

    @Override
    public boolean containsKey(K key) {

        int currentIndex = getHash(key) % getEntriesSize();

        Entry<K, V> currentEntry = entries[currentIndex];

        while (currentEntry != null) {

            if (currentEntry.getKey().equals(key)) {
                return true;
            }
            currentEntry = currentEntry.getNext();
        }

        return false;

    }

    @Override
    public boolean containsValue(V value) {

        for (Entry<K, V> entry : entries) {
            Entry<K, V> currentEntry = entry;
            while (currentEntry != null) {

                if (currentEntry.getValue().equals(value)) {
                    return true;
                }
                currentEntry = currentEntry.getNext();
            }
        }

        return false;
    }

    public int size() {
        return size;
    }

    private int getEntriesSize() {
        return entries.length;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }


}


