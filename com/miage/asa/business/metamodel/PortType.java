package com.miage.asa.business.metamodel;

/** Type of a port or service */
public enum PortType {
    /** A port or service that the component requires in order to work. */
    Requires,
    /** A port or service that is provided by the component. */
    Provides
}
