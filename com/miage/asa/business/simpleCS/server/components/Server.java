package com.miage.asa.business.simpleCS.server.components;

import com.miage.asa.business.metamodel.Binding;
import com.miage.asa.business.metamodel.Complex;
import com.miage.asa.business.metamodel.Component;
import com.miage.asa.business.simpleCS.server.ports.ReceiveRequest;
import com.miage.asa.business.simpleCS.server.serverDetail.components.*;
import com.miage.asa.business.simpleCS.server.serverDetail.components.SecurityManager;
import com.miage.asa.business.simpleCS.server.serverDetail.connectors.GenericConnector;

/**
 * Classe représentant le composent Server d'un système client-serveur
 */
public class Server extends Complex {
    private ReceiveRequest receiveRequestPort;
    
    private Binding serverConnectionManagerBinding;
    
    private Database database;
    private ConnectionManager connectionManager;
    private SecurityManager securityManager;
    
    private GenericConnector dbConnectionConnector;
    private GenericConnector securityConnectionConnector;
    private GenericConnector dbSecurityConnector;

    public Server()
    {
    	// Déclaration des ports du serveur
    	this.receiveRequestPort = new ReceiveRequest();
    	this.receiveRequestPort.setParentComponent(this);
    	
    	// Déclaration des composants du serveur
    	this.database = new Database();
    	database.setParentComponent(this);
    	
    	this.connectionManager = new ConnectionManager();
    	connectionManager.setParentComponent(this);
    	
    	this.securityManager = new SecurityManager();
    	securityManager.setParentComponent(this);
    	
    	// Création des connecteurs entre les composants
    	dbConnectionConnector = new GenericConnector(database.getQueryInterrogationPort(), connectionManager.getDbQueryPort());
    	securityConnectionConnector = new GenericConnector(securityManager.getSecurityAuthenticationPort(), connectionManager.getSecurityCheckPort());
    	dbSecurityConnector = new GenericConnector(database.getSecurityManagementPort(), securityManager.getCheckQueryPort());
    	
    	// Création du binding entre le port du serveur et le ConnectionManager
    	
    	serverConnectionManagerBinding = new Binding(receiveRequestPort, connectionManager.getExternalSocketPort()); 
    	
    	// On ajoute tous les composants aux enfants
    	this.children = new Component[]
		{
			database, connectionManager, securityManager
		};
    }
    
    
    public ReceiveRequest getReceiverRequestPort() {
        return receiveRequestPort;
    }
}
