package dev.personal.java.sistema.solar;

import dev.personal.java.sistema.solar.controller.ControllerPlanet;
import dev.personal.java.sistema.solar.model.Planet;
import dev.personal.java.sistema.solar.model.TypeOfPlanet;
import dev.personal.java.sistema.solar.view.View;


public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Planet earth = new Planet("Tierra", 1,  5.972e24, 1.08321e12, 12742, 149600000, TypeOfPlanet.TERRESTRE, true, 365, 24);
        Planet venus = new Planet("Venus", 0, 4.867e24, 9.28e11, 12104, 108200000, TypeOfPlanet.TERRESTRE, true, 225, 243);

        View view = new View();

        ControllerPlanet earthController = new ControllerPlanet(view, earth);
        ControllerPlanet venusController = new ControllerPlanet(view, venus);

        earthController.startApp();
        venusController.startApp();

    }
}
