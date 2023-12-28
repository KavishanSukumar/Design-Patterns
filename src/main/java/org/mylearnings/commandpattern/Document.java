package org.mylearnings.commandpattern;

public class Document {
    private StringBuilder content = new StringBuilder();

    public void insertText(int position, String text) {
        content.insert(position, text);
    }

    public void deleteText(int position, int length) {
        content.delete(position, position + length);
    }

    public void display() {
        System.out.println(content.toString());
    }
}
