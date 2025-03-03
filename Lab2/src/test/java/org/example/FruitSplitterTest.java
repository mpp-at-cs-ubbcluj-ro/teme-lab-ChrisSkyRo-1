package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitSplitterTest {

    @Test
    public void test1() {
        String fruits = "apple,coconut,melon";
        FruitSplitter splitter = new FruitSplitter(fruits);
        assertEquals(3, splitter.getFruitList().size());
        List<String> testList = new ArrayList<>();
        testList.add("apple");
        testList.add("coconut");
        testList.add("melon");
        assertEquals(testList, splitter.getFruitList());
    }

    @Test
    public void test2() {
        String fruits = "bananacoconutmelon";
        FruitSplitter splitter = new FruitSplitter(fruits);
        assertEquals(1, splitter.getFruitList().size());
        List<String> testList = new ArrayList<>();
        testList.add("bananacoconutmelon");
        assertEquals(testList, splitter.getFruitList());
    }

}