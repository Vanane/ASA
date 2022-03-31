package com.miage.asa.business.simpleCS.server.serverDetail;

import com.miage.asa.business.metamodel.Component;
import com.miage.asa.business.metamodel.Configuration;
import com.miage.asa.business.simpleCS.server.components.Server;
import com.miage.asa.business.simpleCS.server.connectors.ServerBinding;
import com.miage.asa.business.simpleCS.server.serverDetail.components.ConnectionManager;
import com.miage.asa.business.simpleCS.server.serverDetail.components.Database;
import com.miage.asa.business.simpleCS.server.serverDetail.components.SecurityManager;
import com.miage.asa.business.simpleCS.server.serverDetail.connectors.GenericConnector;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.ExternalSocket;

public class ServerDetail extends Configuration {
	
    public Database database;
    public ConnectionManager connectionManager;
    public SecurityManager securityManager;
    
    private GenericConnector dbConnectionConnector;
    private GenericConnector securityConnectionConnector;
    private GenericConnector dbSecurityConnector;
    
    private ExternalSocket externalSocketPort;

	public ServerDetail(Server parent) {
    	// Déclaration des composants du serveur
    	this.database = new Database();
    	database.setParentComponent(parent);
    	
    	this.connectionManager = new ConnectionManager();
    	connectionManager.setParentComponent(parent);
    	
    	this.securityManager = new SecurityManager();
    	securityManager.setParentComponent(parent);
    	
    	// Création des connecteurs entre les composants
    	dbConnectionConnector = new GenericConnector(database.getQueryInterrogationPort(), connectionManager.getDbQueryPort());
    	securityConnectionConnector = new GenericConnector(securityManager.getSecurityAuthenticationPort(), connectionManager.getSecurityCheckPort());
    	dbSecurityConnector = new GenericConnector(database.getSecurityManagementPort(), securityManager.getCheckQueryPort());
    	
    	// Création du binding entre le port du serveur et le ConnectionManager    
	}
	
    public ExternalSocket getExternalSocketPort() {
		return externalSocketPort;
	}
}
