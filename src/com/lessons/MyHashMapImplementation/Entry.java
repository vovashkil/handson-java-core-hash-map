package com.lessons.MyHashMapImplementation;

class Entry<K, V> {

    private K key;
    private V value;
    private Entry<K, V> next;

    private Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Entry entry(K key, V value) {
        return new Entry<>(key, value);
    }

    public Entry with(Entry<K, V> entry) {
        next = entry;
        return entry;
    }

    public V getValue() {
        return value;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;

        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;

            return key.equals(entry.getKey()) &&
                    value.equals(entry.getValue());
        }
        return false;

    }

    @Override
    public int hashCode() {

        int hash = 13;
        hash = 17 * hash + ((key == null) ? 0 : key.hashCode());
        hash = 17 * hash + ((value == null) ? 0 : value.hashCode());

        return hash;

    }

    @Override
    public String toString() {
        return "{" + key + ", " + value + "}";
    }

}
