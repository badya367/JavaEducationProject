package org.education.freetest.creativeTasks.patterns.proxy.accessControl;

import java.nio.file.AccessDeniedException;

public class ProxyDocumentManager implements IDocumentManager{
    private UsersType usersType;
    DocumentManager documentManager;

    public ProxyDocumentManager(UsersType usersType) {
        this.usersType = usersType;
    }


    @Override
    public void openDocument(String docName) {
        System.out.println("Пользователь открыл документ: " + docName);
        getDocumentManager().openDocument(docName);
    }

    @Override
    public void editDocument(String docName) {
        if (usersType != UsersType.ADMIN) {
            throw new RuntimeException(new AccessDeniedException(
                    "Доступ для редактирования файла " + docName + " запрещён"));
        }
        System.out.println("Пользователь изменил документ: " + docName);
        getDocumentManager().editDocument(docName);
    }

    private DocumentManager getDocumentManager() {
        if(documentManager == null) {
            documentManager = new DocumentManager();
        }

        return  documentManager;
    }
}
