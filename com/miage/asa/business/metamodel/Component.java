package com.miage.asa.business.metamodel;

public abstract class Component {
    private String name;
    private String description;
    private Port[] ports;
    private Service[] services;
    private Complex parentComponent;
    private Configuration parentConfiguration;
    
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

    public Port[] getPorts() {
        return ports;
    }

    public void setPorts(Port[] ports) {
        this.ports = ports;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
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
