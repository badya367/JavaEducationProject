package org.education.freetest.creativeTasks.patterns.proxy.accessControl;

public class Main {
    public static void main(String[] args) {
        IDocumentManager documentManager = new ProxyDocumentManager(UsersType.ADMIN);
        IDocumentManager notDocumentManager = new ProxyDocumentManager(UsersType.GUEST);

        documentManager.openDocument("ВажныеДанные.txt");
        documentManager.editDocument("ВажныеДанные.txt");
        notDocumentManager.openDocument("ВажныеДанные.txt");
        notDocumentManager.editDocument("ВажныеДанные.txt");
    }
}
