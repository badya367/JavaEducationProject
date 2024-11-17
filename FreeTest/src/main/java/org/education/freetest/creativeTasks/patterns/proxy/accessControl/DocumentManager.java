package org.education.freetest.creativeTasks.patterns.proxy.accessControl;

public class DocumentManager implements IDocumentManager{
    @Override
    public void openDocument(String docName) {
        System.out.println("Открываю документ с именем:" + docName);
    }

    @Override
    public void editDocument(String docName) {
        System.out.println("Редактирую документ с именем: " + docName);
    }
}
