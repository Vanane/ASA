package com.miage.asa.business.simpleCS.server;

import com.miage.asa.business.metamodel.Complex;

/**
 * Classe représentant le composent Server d'un système client-serveur
 */
public class Server extends Complex {
    private ReceiverRequest receiverRequestPort;

    public ReceiverRequest getReceiverRequestPort() {
        return receiverRequestPort;
    }

    public void setReceiverRequestPort(ReceiverRequest receiverRequestPort) {
        this.receiverRequestPort = receiverRequestPort;
    }    
}
