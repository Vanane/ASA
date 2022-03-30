package com.miage.asa.business.simpleCS.server.serverDetail.components;

import com.miage.asa.business.metamodel.Simple;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.CheckQuery;
import com.miage.asa.business.simpleCS.server.serverDetail.ports.SecurityAuthentication;

public class SecurityManager extends Simple {
    private CheckQuery checkQueryPort;
    private SecurityAuthentication securityAuthenticationPort;
    
    
    public SecurityManager()
    {
    	checkQueryPort = new CheckQuery();
    	checkQueryPort.setParentComponent(this);
    	securityAuthenticationPort = new SecurityAuthentication();
    	securityAuthenticationPort.setParentComponent(this);
    }


	public CheckQuery getCheckQueryPort() {
		return checkQueryPort;
	}


	public SecurityAuthentication getSecurityAuthenticationPort() {
		return securityAuthenticationPort;
	}
}
