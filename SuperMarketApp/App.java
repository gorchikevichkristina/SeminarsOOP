package SeminarsOOP.SuperMarketApp;

import SeminarsOOP.SuperMarketApp.Classes.Market;
import SeminarsOOP.SuperMarketApp.Classes.OrdinaryClient;
import SeminarsOOP.SuperMarketApp.Classes.SpecialClient;
import SeminarsOOP.SuperMarketApp.Classes.TaxInspector;
import SeminarsOOP.SuperMarketApp.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();
    }
}
