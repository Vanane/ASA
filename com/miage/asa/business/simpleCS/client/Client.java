package com.miage.asa.business.simpleCS.client;

import java.util.HashMap;

import com.miage.asa.business.metamodel.Simple;

public class Client extends Simple {
    private SendRequest sendRequestPort;

    public Client()
    {
    	this.sendRequestPort = new SendRequest();
    	this.sendRequestPort.setParentComponent(this);
    }
    
    
    public SendRequest getSendRequestPort() {
        return sendRequestPort;
    }
    
    
    public String sendGET(String message)
    {
    	HashMap<String, Object> args = new HashMap<String, Object>();
    	args.put("message", message);
    	return sendRequestPort.sendCommand(args);
    }
}
