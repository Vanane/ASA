package com.miage.asa.business.simpleCS.client;

import com.miage.asa.business.metamodel.Port;

public class SendRequest extends Port {
    public void sendMessage()
    {
        this.connectedTo.sendMessageToServer();
    }
}
