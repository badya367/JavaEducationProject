package org.education.freetest.creativeTasks.patterns.factoryPtrns.factoryMethod;

public class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
