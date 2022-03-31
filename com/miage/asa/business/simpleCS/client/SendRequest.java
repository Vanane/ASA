package com.miage.asa.business.simpleCS.client;

import java.util.HashMap;

import com.miage.asa.business.metamodel.Port;
import com.miage.asa.business.simpleCS.server.connectors.RPCConnector;

public class SendRequest extends Port {

	@Override
	public String sendCommand(HashMap<String, Object> args) {
		return (String) connector.sendCommandFrom(this, args);
	}

	@Override
	public String receiveCommand(HashMap<String, Object> args) {
		return null; // TODO : à étudier/compléter
	}
}
