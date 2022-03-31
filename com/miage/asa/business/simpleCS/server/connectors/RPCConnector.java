package com.miage.asa.business.simpleCS.server.connectors;

import java.util.HashMap;

import com.miage.asa.business.metamodel.Port;
import com.miage.asa.business.metamodel.PortConnector;
import com.miage.asa.business.simpleCS.client.SendRequest;
import com.miage.asa.business.simpleCS.server.components.Server;
import com.miage.asa.business.simpleCS.server.ports.ReceiveRequest;
/**
 * Représentant le connecteur entre un client et un serveur
 */
public class RPCConnector extends PortConnector {
	public RPCConnector(SendRequest in, ReceiveRequest out) {
		super(in, out);
	}
	
	@Override
	public String sendCommandFrom(Port source, HashMap<String, Object> args) {
		// TODO Auto-generated method stub
		Object result = super.sendCommandFrom(source, args);
		return result.toString();
	}
}
