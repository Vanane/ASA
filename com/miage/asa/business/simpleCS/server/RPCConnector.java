package com.miage.asa.business.simpleCS.server;

import com.miage.asa.business.metamodel.Port;
import com.miage.asa.business.metamodel.PortConnector;

/**
 * Représentant le connecteur entre un client et un serveur
 */
public class RPCConnector extends PortConnector {
    public RPCConnector(Port client, Port server)
    {
        super(client, server);
    }

    /**
     * Notifie le connecteur qu'il doit transmettre un message vers le port serveur
     */
    public void sendMessageToServer()
    {
        outPort.notifyMessage();
    }

    /**
     * Notifie le connecteur qu'il doit transmettre un message vers le port client
     */
    public void sendMessageToClient()
    {
        inPort.notifyMessage();
    }
}
