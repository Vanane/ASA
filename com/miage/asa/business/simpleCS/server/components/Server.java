package com.miage.asa.business.simpleCS.server.components;

import com.miage.asa.business.metamodel.Binding;
import com.miage.asa.business.metamodel.Complex;
import com.miage.asa.business.metamodel.Component;
import com.miage.asa.business.simpleCS.server.connectors.ServerBinding;
import com.miage.asa.business.simpleCS.server.ports.ReceiveRequest;
import com.miage.asa.business.simpleCS.server.serverDetail.ServerDetail;
import com.miage.asa.business.simpleCS.server.serverDetail.components.*;
import com.miage.asa.business.simpleCS.server.serverDetail.components.SecurityManager;
import com.miage.asa.business.simpleCS.server.serverDetail.connectors.GenericConnector;

/**
 * Classe représentant le composent Server d'un système client-serveur
 */
public class Server extends Complex {
    private ReceiveRequest receiveRequestPort;
    private ServerBinding serverConnectionManagerBinding;
    private ServerDetail serverDetail;
    
    public Server()
    {
    	// Déclaration des ports du serveur
    	this.receiveRequestPort = new ReceiveRequest();
    	this.receiveRequestPort.setParentComponent(this);
    	
    	this.serverDetail = new ServerDetail(this);
    	
    	serverConnectionManagerBinding = new ServerBinding(this.getReceiverRequestPort(), serverDetail.getExternalSocketPort()); 

    	// On ajoute tous les composants aux enfants
    	this.children = new Component[]
		{
			serverDetail.database, serverDetail.connectionManager, serverDetail.securityManager
		};
    }
    
    
    public ReceiveRequest getReceiverRequestPort() {
        return receiveRequestPort;
    }
    
    /**
     * Gère une requête d'un client et renvoie une réponse.
     */
    public String handleRequest(String message)
    {
    	if(message == "ping")
    		return "pong";
    	else return "ok.";
    }
}
