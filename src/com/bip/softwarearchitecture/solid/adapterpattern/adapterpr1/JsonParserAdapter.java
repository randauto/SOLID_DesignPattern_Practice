package com.bip.softwarearchitecture.solid.adapterpattern.adapterpr1;

public class JsonParserAdapter implements IParser {
    private JSonParser parser;

    JsonParserAdapter(JSonParser parser) {
        this.parser = parser;
    }

    @Override
    public void parser() {
        parser.parserData();
    }
}
