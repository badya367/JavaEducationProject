package org.education.freetest.creativeTasks.patterns.factoryPtrns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        Document wordDocument = wordDocumentFactory.createDocument();
        wordDocument.open();

        DocumentFactory pdfDocumentFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfDocumentFactory.createDocument();
        pdfDocument.open();

        DocumentFactory textDocumentFactory = new TextDocumentFactory();
        Document textDocument = textDocumentFactory.createDocument();
        textDocument.open();
    }
}
