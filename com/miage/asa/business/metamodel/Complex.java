package com.miage.asa.business.metamodel;

public class Complex extends Component {
    public Component[] children;

    public Component[] getChildren() {
        return children;
    }

    public void setChildren(Component[] children) {
        this.children = children;
    }    
}
