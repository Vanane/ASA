package com.miage.asa.business.metamodel;

public abstract class Component {
    protected String name;
    protected String description;
    protected Complex parentComponent;
    protected Configuration parentConfiguration;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Complex getParentComponent() {
        return parentComponent;
    }

    public void setParentComponent(Complex parentComponent) {
        this.parentComponent = parentComponent;
    }

    public Configuration getParentConfiguration() {
        return parentConfiguration;
    }

    public void setParentConfiguration(Configuration parentConfiguration) {
        this.parentConfiguration = parentConfiguration;
    }
    
    
}
