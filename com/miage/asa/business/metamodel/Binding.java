package com.miage.asa.business.metamodel;

import java.util.HashMap;

public abstract class Binding {
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
    
    
    public Object sendCommandFrom(Port source, HashMap<String,Object> args)
    {
    	if(source == inPort)
    		return outPort.receiveCommand(args);
    	else
			return inPort.receiveCommand(args);
    }
}
