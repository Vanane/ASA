package com.miage.asa.business.metamodel;

public abstract class Configuration {
	protected Component parentComponent;
    protected Component[] components;
    protected Connector[] connectors;
    
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
