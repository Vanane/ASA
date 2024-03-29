package com.miage.asa.business.metamodel;

public abstract class Service {
    protected Binding bindedTo;
    protected Component parentComponent;
    protected Connector connectedTo;
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
