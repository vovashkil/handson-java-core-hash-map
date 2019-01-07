package com.lessons.MyHashMapImplementation;

import java.util.Objects;

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

        int currentIndex = getIndexByKey(key);

        Entry<K, V> currentEntry = entries[currentIndex];

        if (currentEntry == null) {

            entries[currentIndex] = entry;
            size++;

        } else {

            Entry<K, V> tail = currentEntry;

            while (currentEntry != null) {

                if (Objects.equals(currentEntry.getKey(), key)) {

                    currentEntry.setValue(value);
                    return;

                }

                tail = currentEntry;
                currentEntry = currentEntry.getNext();

            }

            tail.with(entry);
            size++;

        }

    }

    @Override
    public V get(K key) {

        Entry<K, V> currentEntry = entries[getIndexByKey(key)];

        if (key == null) return currentEntry.getValue();

        while (currentEntry != null) {

            if (Objects.equals(currentEntry.getKey(), key)) {

                return currentEntry.getValue();

            }

            currentEntry = currentEntry.getNext();

        }

        return null;
    }

    @Override
    public boolean containsKey(K key) {

        Entry<K, V> currentEntry = entries[getIndexByKey(key)];

        while (currentEntry != null) {

            if (Objects.equals(currentEntry.getKey(), key)) {

                return true;

            }

            currentEntry = currentEntry.getNext();

        }

        return false;

    }

    private int getIndexByKey(K key) {

        return getHash(key) % getEntriesSize();

    }

    @Override
    public boolean containsValue(V value) {

        for (Entry<K, V> entry : entries) {
            Entry<K, V> currentEntry = entry;
            while (currentEntry != null) {

                if (Objects.equals(currentEntry.getValue(), value)) {
                    return true;

                }

                currentEntry = currentEntry.getNext();

            }
        }

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private int getEntriesSize() {
        return entries.length;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

    @Override
    public void display() {

        for (Entry<K, V> entry : entries) {
            while (entry != null) {
                System.out.print("{" + entry.getKey() + "=" + entry.getValue() + "}" + " ");
                entry = entry.getNext();
            }
        }

    }


}


