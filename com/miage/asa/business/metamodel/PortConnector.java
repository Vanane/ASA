package com.miage.asa.business.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class PortConnector extends Connector {
    protected HashMap<Port, Port> gluePorts;

    public PortConnector(Port in, Port out)
    {
    	in.setConnectedTo(this);
    	out.setConnectedTo(this);
    	
    	gluePorts = new HashMap<>();
    	gluePorts.put(in, out);
    }
    
    
    @Override public Object sendCommandFrom(Port source, HashMap<String,Object> args)
    {
    	if(!gluePorts.containsKey(source)) return null;
		return gluePorts.get(source).receiveCommand(args);
    }
}
