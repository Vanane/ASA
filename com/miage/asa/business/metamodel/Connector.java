package com.miage.asa.business.metamodel;

import java.util.HashMap;

public abstract class Connector {
    protected Configuration parentConfiguration;

    public Configuration getParentConfiguration() {
        return parentConfiguration;
    }

    public void setParentConfiguration(Configuration parentConfiguration) {
        this.parentConfiguration = parentConfiguration;
    }
    
    public abstract Object sendCommandFrom(Port source, HashMap<String, Object> args);
}
