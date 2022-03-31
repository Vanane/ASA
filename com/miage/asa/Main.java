package com.miage.asa;

import com.miage.asa.business.metamodel.Configuration;
import com.miage.asa.business.simpleCS.SimpleCS;
import com.miage.asa.business.simpleCS.client.Client;

public class Main {
    public Main()
    {

    }

    public static void main(String[] args)
    {
        SimpleCS system = new SimpleCS();        
        Client client = system.getClient();
        System.out.println(client.sendGET("test"));        
    }    
}
