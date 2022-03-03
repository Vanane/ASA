package com.miage.asa.business.metamodel;

public class Configuration {
    private Component[] components;
    private Connector[] connectors;
    
    public Component[] getComponents() {
        return components;
    }
    public void setComponents(Component[] components) {
        this.components = components;
    }
    public Connector[] getConnectors() {
        return connectors;
    }
    public void setConnectors(Connector[] connectors) {
        this.connectors = connectors;
    }

    
}
