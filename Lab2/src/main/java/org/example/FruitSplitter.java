package org.example;

import com.google.common.base.Splitter;

import java.util.List;

public class FruitSplitter {

    private final List<String> fruitList;

    public FruitSplitter(String fruits) {
        this.fruitList = Splitter.on(",").splitToList(fruits);
    }

    public List<String> getFruitList() {
        return fruitList;
    }
}
