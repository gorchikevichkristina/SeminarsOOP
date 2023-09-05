package SeminarsOOP.SuperMarketApp.Classes;

import SeminarsOOP.SuperMarketApp.Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);
    abstract public String getName();

}
