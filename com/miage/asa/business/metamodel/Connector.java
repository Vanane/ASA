package com.miage.asa.business.metamodel;

public abstract class Connector {
    private Configuration parentConfiguration;

    public Configuration getParentConfiguration() {
        return parentConfiguration;
    }

    public void setParentConfiguration(Configuration parentConfiguration) {
        this.parentConfiguration = parentConfiguration;
    }
}
