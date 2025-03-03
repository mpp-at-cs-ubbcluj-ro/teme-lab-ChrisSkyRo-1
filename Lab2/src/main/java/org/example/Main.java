package org.example;

public class Main {
    public static void main(String[] args) {
        String fruits = "apple,banana,orange,watermelon,guava,apple";
        FruitSplitter splitter = new FruitSplitter(fruits);
        System.out.println("Fruits: " + splitter.getFruitList());
    }
}