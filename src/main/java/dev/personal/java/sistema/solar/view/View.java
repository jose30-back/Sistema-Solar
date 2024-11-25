package dev.personal.java.sistema.solar.view;

import dev.personal.java.sistema.solar.model.Planet;

public class View {

    public void printPlanet (Planet planet){
        System.out.println("--------------Planet-------------");
        System.out.println("Nombre:" + planet.getName());
        System.out.println("Numero de satelites: " + planet.getNumberOfSatellites());
        System.out.println("Masa: " + planet.getMass());
        System.out.println("Volumen: " + planet.getVolume());
        System.out.println("Diametro: " + planet.getDiameter());
        System.out.println("Distancia al sol: " + planet.getDistanceToTheSun());
        System.out.println("Tipo de planeta: " + planet.getTypeOfPlanet());
        System.out.println("Observable?: " + planet.isObservable());
        System.out.println("Periodo orbital: " + planet.getOrbitalPeriod());
        System.out.println("Periodo de rotacion: " + planet.getRotationPeriod());
        System.out.println("La densidad del planeta es: " + planet.calculateDensity());
        System.out.println("El planeta es: " + planet.isOutside());
    }

}

