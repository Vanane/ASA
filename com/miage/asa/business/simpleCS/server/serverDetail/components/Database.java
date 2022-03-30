package com.miage.asa.business.simpleCS.server.serverDetail.components;

import com.miage.asa.business.metamodel.Simple;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.QueryInterrogation;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.SecurityManagement;

public class Database extends Simple {
    private QueryInterrogation queryInterrogationPort;
    private SecurityManagement securityManagementPort;
    
    public Database()
    {
    	queryInterrogationPort = new QueryInterrogation();
    	queryInterrogationPort.setParentComponent(this);
    	
    	securityManagementPort = new SecurityManagement();
    	securityManagementPort.setParentComponent(this);
    }

	public QueryInterrogation getQueryInterrogationPort() {
		return queryInterrogationPort;
	}

	public SecurityManagement getSecurityManagementPort() {
		return securityManagementPort;
	}
}
