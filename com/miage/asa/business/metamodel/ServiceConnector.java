package com.miage.asa.business.metamodel;

public class ServiceConnector extends Connector {
    private Service inService, outService;

    public Service getInService() {
        return inService;
    }

    public void setInService(Service inService) {
        this.inService = inService;
    }

    public Service getOutService() {
        return outService;
    }

    public void setOutService(Service outService) {
        this.outService = outService;
    }
}