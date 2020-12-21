package com.epam.SRP.goodPractice;

public class Book {
    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}
