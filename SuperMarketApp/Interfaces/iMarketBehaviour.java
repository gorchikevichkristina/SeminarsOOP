package SeminarsOOP.SuperMarketApp.Interfaces;

import java.util.List;

import SeminarsOOP.SuperMarketApp.Classes.Actor;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
