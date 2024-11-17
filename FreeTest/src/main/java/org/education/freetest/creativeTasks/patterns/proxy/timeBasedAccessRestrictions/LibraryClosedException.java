package org.education.freetest.creativeTasks.patterns.proxy.timeBasedAccessRestrictions;

public class LibraryClosedException extends RuntimeException {
    public LibraryClosedException(String error){
        super(error);
    }
}
