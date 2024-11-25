package dev.personal.java.sistema.solar.controller;

import dev.personal.java.sistema.solar.model.Planet;
import dev.personal.java.sistema.solar.view.View;

public class ControllerPlanet {

    View view;
    Planet planet;

    public ControllerPlanet(View view, Planet planet)  {
        this.view = view;
        this.planet = planet;
    }

    public void startApp () {
        view.printPlanet(planet);
    }
}
