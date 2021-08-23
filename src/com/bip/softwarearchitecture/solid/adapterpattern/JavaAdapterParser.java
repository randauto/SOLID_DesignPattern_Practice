package com.bip.softwarearchitecture.solid.adapterpattern;

public class JavaAdapterParser implements CSVParser {
    private JavaParser javaParser;

    public JavaAdapterParser(JavaParser javaParser) {
        this.javaParser = javaParser;
    }

    @Override
    public void parse() {
        javaParser.parserFileXml();
    }
}
