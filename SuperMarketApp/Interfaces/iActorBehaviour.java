package SeminarsOOP.SuperMarketApp.Interfaces;

import SeminarsOOP.SuperMarketApp.Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean take);
    public void setMakeOrder(boolean make);
    Actor getActor();
}
