package com.miage.asa.business.simpleCS;

import java.net.ConnectException;

import com.miage.asa.business.metamodel.Configuration;
import com.miage.asa.business.metamodel.PortConnector;
import com.miage.asa.business.simpleCS.client.Client;
import com.miage.asa.business.simpleCS.server.*;
import com.miage.asa.business.simpleCS.server.components.Server;


/**
 * Classe représentant la configuration qui définit un système client-serveur simple
 */
public class SimpleCS extends Configuration {
    private Client clientComponent;
    private Server serverComponent;
    private PortConnector RPCConnector;

    public SimpleCS()
    {
    	
        this.clientComponent = new Client();
        this.clientComponent.setParentConfiguration(this);

        this.serverComponent = new Server();
        this.serverComponent.setParentConfiguration(this);

        this.RPCConnector = new PortConnector(clientComponent.getSendRequestPort(), serverComponent.getReceiverRequestPort());
        this.RPCConnector.setParentConfiguration(this);        
    }
}
