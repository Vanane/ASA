package com.miage.asa.business.simpleCS.server.serverDetail.components;

import com.miage.asa.business.metamodel.Simple;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.DBQuery;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.ExternalSocket;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.SecurityCheck;

/**
 * Classe représentant le composent ConnectionmManager du serveur
 */
public class ConnectionManager extends Simple {

	private SecurityCheck securityCheckPort;
    private DBQuery dbQueryPort;
    private ExternalSocket externalSocketPort;
    
    
    public ConnectionManager()
    {
    	securityCheckPort = new SecurityCheck();
    	securityCheckPort.setParentComponent(this);
    	
    	dbQueryPort = new DBQuery();
    	dbQueryPort.setParentComponent(this);
    	
    	externalSocketPort = new ExternalSocket();
    	externalSocketPort.setParentComponent(this);
    }
    
    public SecurityCheck getSecurityCheckPort() {
		return securityCheckPort;
	}


	public DBQuery getDbQueryPort() {
		return dbQueryPort;
	}


	public ExternalSocket getExternalSocketPort() {
		return externalSocketPort;
	}
}
