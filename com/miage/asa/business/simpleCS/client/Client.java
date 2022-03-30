package com.miage.asa.business.simpleCS.client;

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
}
