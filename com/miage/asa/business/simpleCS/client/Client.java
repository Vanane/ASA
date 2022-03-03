package com.miage.asa.business.simpleCS.client;

import com.miage.asa.business.metamodel.Simple;

public class Client extends Simple {
    private SendRequest sendRequestPort;

    public SendRequest getSendRequestPort() {
        return sendRequestPort;
    }

    public void setSendRequestPort(SendRequest sendRequestPort) {
        this.sendRequestPort = sendRequestPort;
    }


    public void sendGET()
    {
        sendRequestPort.sendMessage();
        System.out.println("Sent GET request to Server");
    }   
}
