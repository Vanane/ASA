package com.miage.asa.business.simpleCS.server.serverDetail.ports;

import java.util.HashMap;

import com.miage.asa.business.metamodel.Port;

public class CheckQuery extends Port {

	@Override
	public Object sendCommand(HashMap<String, Object> args) {
		return connector.sendCommandFrom(this, args);
	}

	@Override
	public Object receiveCommand(HashMap<String, Object> args) {
        return null;		
	}
}
