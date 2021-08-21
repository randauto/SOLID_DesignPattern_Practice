package com.bip.softwarearchitecture.solid.strategy;

public class TextEditor {
    private TextFormater textFormater;

    public TextEditor(TextFormater textFormater) {
        this.textFormater = textFormater;
    }

    public void changeFormater(TextFormater formater) {
        this.textFormater = formater;
    }

    public TextFormater getCurrentFormater() {
        return textFormater;
    }

    public void publishText(String text) {
        textFormater.formatText(text);
    }
}
