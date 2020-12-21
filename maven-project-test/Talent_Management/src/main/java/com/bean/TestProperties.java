package com.bean;

import java.util.Properties;

public class TestProperties {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "TestProperties{" +
                "properties=" + properties +
                '}';
    }
}
