package com.miage.asa.business.metamodel;

public class Service {
    private Binding bindedTo;
    private Component parentComponent;
    private Connector connectedTo;
    private PortType portType;
        
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
    public Connector getConnectedTo() {
        return connectedTo;
    }
    public void setConnectedTo(Connector connectedTo) {
        this.connectedTo = connectedTo;
    }
    public PortType getPortType() {
        return portType;
    }
    public void setPortType(PortType portType) {
        this.portType = portType;
    }
}
