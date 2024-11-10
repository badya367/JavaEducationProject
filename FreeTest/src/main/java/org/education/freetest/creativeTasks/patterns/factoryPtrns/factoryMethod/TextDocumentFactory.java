package org.education.freetest.creativeTasks.patterns.factoryPtrns.factoryMethod;

public class TextDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
