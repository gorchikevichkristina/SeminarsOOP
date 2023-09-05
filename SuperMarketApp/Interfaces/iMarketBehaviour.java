package OOP.SuperMarketApp.Interfaces;

import java.util.List;

import OOP.SuperMarketApp.Classes.Actor;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
