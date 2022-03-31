package com.miage.asa.business.metamodel;

public abstract class Complex extends Component {
    protected Component[] children;

    public Component[] getChildren() {
        return children;
    }

    public void setChildren(Component[] children) {
        this.children = children;
    }    
}
