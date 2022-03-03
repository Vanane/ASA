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
}
