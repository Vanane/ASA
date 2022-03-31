package com.miage.asa.business.simpleCS.server.ports;

import java.util.HashMap;

import com.miage.asa.business.metamodel.Port;
import com.miage.asa.business.simpleCS.server.components.Server;

public class ReceiveRequest extends Port {
	@Override
	public Object sendCommand(HashMap<String, Object> args) {
		return connector.sendCommandFrom(this, args);
	}

	@Override
	public String receiveCommand(HashMap<String, Object> args) {
		System.out.println("Received GET with arguments :");
		
		for(String k : args.keySet())
		{
			System.out.println("\t" + k + " : " + args.get(k));
		}
		
        return ((Server) this.parentComponent).handleRequest((String) args.get("message"));		
	}
}
