package com.bean;

import java.util.Set;

public class TestSet {
    private Set set;

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "TestSet{" +
                "set=" + set +
                '}';
    }
}
