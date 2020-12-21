package com.epam.SRP.goodPractice;

public class BookPrinter {

    // We separate logic of manipulation with text in book
    // from logic that realize printing text

    void printTextToConsole(String text) {
        System.out.println(text);
    }

    void printTextToAnotherMedium(String text) {
        if (text.contains("Some words")) {
            System.out.println(text);
        }
    }
}
