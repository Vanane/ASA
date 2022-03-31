package com.miage.asa.business.metamodel;

import java.util.HashMap;

public abstract class Port {
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
    
    
    public abstract Object sendCommand(HashMap<String, Object> args);
    
    public abstract Object receiveCommand(HashMap<String, Object> args);
}
