package com.miage.asa.business.metamodel;

public class Port {
    protected Binding bindedTo;
    protected Component parentComponent;
    protected PortConnector connector;
    protected PortType portType;
    
    public Binding getBindedTo() {
        return bindedTo;
    }
    public void setBindedTo(Binding bindedTo) {
        this.bindedTo = bindedTo;
    }
    public Component getParentComponent() {
        return parentComponent;
    }
    public void setParentComponent(Component parentComponent) {
        this.parentComponent = parentComponent;
    }
    public PortConnector getConnectedTo() {
        return connector;
    }
    public void setConnectedTo(PortConnector connectedTo) {
        this.connector = connectedTo;
    }
    public PortType getPortType() {
        return portType;
    }
    public void setPortType(PortType portType) {
        this.portType = portType;
    }
}
