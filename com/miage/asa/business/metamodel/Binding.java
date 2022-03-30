package com.miage.asa.business.metamodel;

public class Binding {
    protected Port inPort, outPort;

    public Binding(Port in, Port out)
    {
    	inPort = in;
    	outPort = out;
    }
    
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
