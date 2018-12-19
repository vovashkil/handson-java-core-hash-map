package com.lessons.MyHashMapImplementation;

public class App {


    public static void main(String[] args) {

        Entry<String, Integer> head = Entry.entry("key", 12);
        head.with(Entry.entry("key2", 23)).with(Entry.entry("key3", 34));
        print(head);

        MySimpleHashMap<String, Integer> hashMap = new MySimpleHashMap<>();

        hashMap.put("key2", 23);
        hashMap.put("key1", 45);
        hashMap.put("key",46);
        System.out.println(hashMap.containsKey("key5"));
        System.out.println(hashMap.containsValue(46));

    }

    static void print (Entry head){
        Entry entry = head;
        while (entry != null){
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            entry = entry.getNext();
        }
    }




}

