package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.filteringData;

public abstract class Filter {
    protected Filter filter;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public abstract void process(String input);
}
