package com.bip.softwarearchitecture.solid.adapterpattern.adapterpr1;

public class AdapterAppDemo {
    public static void main(String[] args) {
        IParser xmlParser = new XmlParser();
        xmlParser.parser();

        IParser jsonAdapter = new JsonParserAdapter(new JSonParser());
        jsonAdapter.parser();
    }
}
