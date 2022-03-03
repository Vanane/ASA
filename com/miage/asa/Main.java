package com.miage.asa;

import com.miage.asa.business.metamodel.Configuration;
import com.miage.asa.business.simpleCS.server.SimpleCS;

public class Main {
    public Main()
    {

    }

    public static void main(String[] args)
    {
        SimpleCS system = new SimpleCS();
        system.simulateMessage();        
    }    
}
