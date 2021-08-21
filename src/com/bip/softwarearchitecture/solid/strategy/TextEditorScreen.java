package com.bip.softwarearchitecture.solid.strategy;

public class TextEditorScreen {
    public static void main(String[] args) {
        TextFormater textFormater = new BoldFormater();
        String myMessage = "Le Quoc Tuan";

        TextEditor textEditor = new TextEditor(textFormater);
        textEditor.publishText(myMessage);
        textFormater = new ItalicFormater();
        textEditor.changeFormater(textFormater);
        textEditor.publishText(myMessage);
    }
}
