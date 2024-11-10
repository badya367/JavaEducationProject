package org.education.freetest.creativeTasks.patterns.factoryPtrns.factoryMethod;

public class PDFDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
