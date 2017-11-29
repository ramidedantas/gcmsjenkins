package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = "xx" + name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
