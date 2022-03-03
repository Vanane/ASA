package com.miage.asa.business.metamodel;

public class PortConnector extends Connector {
    private Port inPort, outPort;

    public Port getInPort() {
        return inPort;
    }

    public void setInPort(Port inPort) {
        this.inPort = inPort;
    }

    public Port getOutPort() {
        return outPort;
    }

    public void setOutPort(Port outPort) {
        this.outPort = outPort;
    }
}
