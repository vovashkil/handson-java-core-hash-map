package com.lessons.MyHashMapImplementation;

import org.junit.Assert;
import org.junit.Test;

public class MySimpleHashMapTest {

    @Test
    public void sizeReturnsZeroIfHashMapIsEmpty() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        Assert.assertEquals(myHashMap.size(), 0);

    }

    @Test
    public void sizeIncreasesWhenPutUniqueKeys() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);
        myHashMap.put("key4", 28);
        Assert.assertEquals(myHashMap.size(), 4);

    }

    @Test
    public void sizeTheSameWhenPutNonUniqueKeys() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);
        myHashMap.put("key1", 28);
        Assert.assertEquals(myHashMap.size(), 3);

    }

    @Test
    public void sizeIncreasesWhenPutEntryWithNullKey() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put(null, null);
        Assert.assertEquals(myHashMap.size(), 1);

    }

    @Test
    public void getReturnsTheLastValueIfANumberOfConsequentiveEntriesWithKeysEqualNullWereAdded() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put(null, 1);

        int result = myHashMap.get(null);
        Assert.assertEquals(result, 1);

        myHashMap.put(null, 2);
        myHashMap.put(null, 3);

        result = myHashMap.get(null);
        Assert.assertEquals(result, 3);

    }

    @Test
    public void getReturnsCorrectValueMappedToKey() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        int result = myHashMap.get("key1");
        Assert.assertEquals(result,22);

    }

    @Test
    public void containsKeyReturnsTrueWhenHashMapContainsKey() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertTrue(myHashMap.containsKey("key1"));

    }
    @Test
    public void containsKeyReturnsFalseWhenHashMapDoesNotContainKey() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertFalse(myHashMap.containsKey("key11"));

    }

    @Test
    public void containsValueReturnsTrueWhenHashMapContainsValue() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertTrue(myHashMap.containsValue(22));

    }
    @Test
    public void containsValueReturnsFalseWhenHashMapDoesNotContainValue() {

        SimpleHashMap<String, Integer> myHashMap = new MySimpleHashMap();

        myHashMap.put("key1", 22);
        myHashMap.put("key2", 25);
        myHashMap.put("key3", 26);

        Assert.assertFalse(myHashMap.containsValue(27));

    }



}


