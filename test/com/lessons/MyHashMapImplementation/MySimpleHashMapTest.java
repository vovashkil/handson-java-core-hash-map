package com.lessons.MyHashMapImplementation;

import org.junit.Assert;
import org.junit.Test;

public class MySimpleHashMapTest {

    @Test
    public void HashMapSizeIncreasesWhenPutUniqueKeys() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);
        myHashMap.put("key4", 28);
        Assert.assertEquals(myHashMap.size(), 4);

    }

    @Test
    public void HashMapSizeTheSameWhenPutNonUniqueKeys() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);
        myHashMap.put("key1", 28);
        Assert.assertEquals(myHashMap.size(), 3);

    }

    @Test
    public void HashMapSizeIncreasesWhenPutFirstNullKey() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put(null, null);
        Assert.assertEquals(myHashMap.size(), 1);

    }

    @Test(expected = NullPointerException.class)
    public void NullPointerExceptionWhenPutNullKeyTwoTimes() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put(null, null);
        myHashMap.put(null, null);

    }

    @Test
    public void GetReturnCorrectValueMappedToKey() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        int result = myHashMap.get("key1");
        Assert.assertEquals(result,22);

    }
    @Test
    public void GetReturnIncorrectValueMappedToKey() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        int result = myHashMap.get("key1");
        Assert.assertNotEquals(result,23);

    }

    @Test
    public void ContainsKeyReturnTrueWhenHashMapContainsKey() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertTrue(myHashMap.containsKey("key1"));

    }
    @Test
    public void ContainsKeyReturnFalseWhenHashMapDoesNotContainKey() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertFalse(myHashMap.containsKey("key11"));

    }

    @Test
    public void ContainsValueReturnTrueWhenHashMapContainsValue() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertTrue(myHashMap.containsValue(22));

    }
    @Test
    public void ContainsValueReturnFalseWhenHashMapDoesNotContainValue() {

        MySimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap<>();

        Assert.assertEquals(myHashMap.size(), 0);
        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertFalse(myHashMap.containsValue(27));

    }



}


