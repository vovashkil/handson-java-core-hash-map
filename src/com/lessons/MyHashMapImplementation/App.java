package com.lessons.MyHashMapImplementation;

public class App {

    public static void main(String[] args) {

        Entry<String, Integer> head = Entry.entry("key", 12);
        head.with(Entry.entry("key2", 23))
                .with(Entry.entry("key3", 34))
                .with(Entry.entry(null, 10))
                .with(Entry.entry(null, 11));
        print(head);

        SimpleHashMap<String, Integer> hashMap = new MySimpleHashMap();

        hashMap.put("key2", 23);
        hashMap.put("key1", 45);
        hashMap.put("key44", 47);
        hashMap.put("key6", 99);
        hashMap.put("key", 220);
        hashMap.put(null, 97);
        hashMap.put(null, 95);
        hashMap.put(null, 101);
        hashMap.put(null, 220);
        System.out.println(hashMap.containsKey("key44"));
        System.out.println(hashMap.containsValue(23));
        hashMap.display();

    }

    static void print(Entry head) {
        Entry entry = head;
        while (entry != null) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            entry = entry.getNext();
        }
    }

}

