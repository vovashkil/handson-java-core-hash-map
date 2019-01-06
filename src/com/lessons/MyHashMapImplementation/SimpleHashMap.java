package com.lessons.MyHashMapImplementation;

public interface SimpleHashMap<K, V> {

    void put(K key, V value);
    V get(K key);
    boolean containsKey(K key);
    boolean containsValue(V value);
    int size();
    void display();

}
