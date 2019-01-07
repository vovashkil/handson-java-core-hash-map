package com.lessons.MyHashMapImplementation;

public class App {

    public static void main(String[] args) {

        Entry<String, Integer> head = Entry.entry("key1", 12);
        head.with(Entry.entry("key10", 23))
                .with(Entry.entry("key9", 34))
                .with(Entry.entry(null, 10))
                .with(Entry.entry(null, 11));
        print(head);

        SimpleHashMap<String, Integer> hashMap = new MySimpleHashMap();

        Entry entry = head;
        while (entry != null) {
            hashMap.put((String)entry.getKey(), (Integer)entry.getValue());
            entry = entry.getNext();
        }

        hashMap.put("key22", 23);
        hashMap.put("key33", 45);
        hashMap.put("key44", 47);
        hashMap.put("key6", 99);
        hashMap.put(null, 97);
        hashMap.put(null, 95);
        hashMap.put(null, null);
        hashMap.put(null, null);
        System.out.println(hashMap.containsKey("key44"));
        System.out.println(hashMap.containsKey(null));
        System.out.println(hashMap.containsValue(24));
        System.out.println(hashMap.containsValue(null));
        hashMap.display();
        System.out.println("\nhashMap size = " + hashMap.size());

    }

    static void print(Entry head) {
        Entry entry = head;
        while (entry != null) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            entry = entry.getNext();
        }
    }

}

